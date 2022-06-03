package com.revature;

public class BankDaoFactory {
    public static BankDao bankDao;

    private BankDaoFactory(){
    }
    public static BankDao getBankDao() {
        if (bankDao == null)
            bankDao = new BankDaoImpl();
        return bankDao;
    }
}
