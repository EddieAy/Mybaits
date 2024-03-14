package zera.bank.dao.impl;

import org.apache.ibatis.session.SqlSession;
import zera.bank.dao.AccountDao;
import zera.bank.pojo.Account;
import zera.bank.util.SqlSessionUtil;

public class AccountDaoImpl implements AccountDao {
    @Override
    public Account selectByActNum(String actNum) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        Account account = (Account)sqlSession.selectOne("account.selectByActNum", actNum);
        return account;
    }

    @Override
    public int updateByActNum(Account account) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        int count = sqlSession.update("account.updateByActNum",account);
        return count;
    }
}
