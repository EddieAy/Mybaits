package zera.bank.service.impl;

import org.apache.ibatis.session.SqlSession;
import zera.bank.dao.AccountDao;
import zera.bank.dao.impl.AccountDaoImpl;
import zera.bank.exceptions.MoneyNotEnoughException;
import zera.bank.exceptions.TransferFailException;
import zera.bank.pojo.Account;
import zera.bank.service.AccountService;
import zera.bank.util.SqlSessionUtil;

public class AccountServiceImpl implements AccountService {
    AccountDao accountDao = new AccountDaoImpl();
    @Override
    public void transfer(String fromActNum, String toActNum, double money) throws MoneyNotEnoughException, TransferFailException {

        SqlSession sqlSession = SqlSessionUtil.openSession();

        Account fromAccount = accountDao.selectByActNum(fromActNum);
        if (fromAccount.getBalance() < money) {
            throw new MoneyNotEnoughException("Your balance is not enough");

        }

        Account toAccount = accountDao.selectByActNum(toActNum);
        fromAccount.setBalance(fromAccount.getBalance() - money);
        toAccount.setBalance(toAccount.getBalance() + money);


        int count1 = accountDao.updateByActNum(fromAccount);

        String s = null;
        s.toString();

        int count2 = accountDao.updateByActNum(toAccount);
        if(count1 + count2 != 2){
            throw new TransferFailException("Transfer fail");
        }

        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);

    }
}
