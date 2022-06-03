package com.revature;

public class BankEmployeeDaoFactory {
    public static BankEmployeeDao bankEmployeeDao;

    private BankEmployeeDaoFactory() {
    }

    public static BankEmployeeDao getBankEmployeeDao() {
        if(bankEmployeeDao == null)
            bankEmployeeDao = new BankEmployeeDaoImpl();
        return bankEmployeeDao;
    }
}
