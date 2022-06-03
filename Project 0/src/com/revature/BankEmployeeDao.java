package com.revature;

import java.sql.SQLException;
import java.util.List;

public interface BankEmployeeDao {
    void addBankEmployee(BankEmployee bankEmployee) throws SQLException;
    void updateBankEmployee(BankEmployee bankEmployee) throws SQLException;
    void deleteBankEmployee(int empID) throws SQLException;
    List<BankEmployee> getbankEmployees() throws SQLException;
    BankEmployee getbankEmployeeByID(int empID) throws SQLException;
}
