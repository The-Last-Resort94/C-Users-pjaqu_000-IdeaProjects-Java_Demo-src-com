package com.revature;

import java.sql.SQLException;
import java.util.List;

public class BankEmployeeDaoImpl implements BankEmployeeDao {
    @Override
    public void addBankEmployee(BankEmployee newbankEmployee) throws SQLException {
        String sql = "insert into BankEmployee (empName, empEmail, empAdminCode) values (?, ?, ?)";


    }

    @Override
    public void updateBankEmployee(BankEmployee bankEmployee) throws SQLException {

    }

    @Override
    public void deleteBankEmployee(int empID) throws SQLException {

    }

    @Override
    public List<BankEmployee> getbankEmployees() throws SQLException {
        return null;
    }

    @Override
    public BankEmployee getbankEmployeeByID(int empID) throws SQLException {
        return null;
    }
}
