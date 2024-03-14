package zera.bank.dao;

import zera.bank.pojo.Account;

public interface AccountDao {
    Account selectByActNum(String actNum);

    int updateByActNum(Account account);
}
