package zera.bank.service;

import zera.bank.exceptions.MoneyNotEnoughException;
import zera.bank.exceptions.TransferFailException;

public interface AccountService {

    void transfer(String fromActNum,String toActNum,double money) throws MoneyNotEnoughException, TransferFailException;
}
