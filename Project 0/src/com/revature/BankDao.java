package com.revature;

import java.sql.SQLException;
import java.util.List;

public interface BankDao {
    void withdrawBankChecking(Bank drawBankChecking) throws SQLException;
    void depositBankChecking(Bank depoBankChecking) throws SQLException;
    void withdrawBankSavings(Bank drawBankSavings) throws SQLException;
    void depositBankSavings(Bank depoBankSavings) throws SQLException;
    void transferBankChecking(Bank transferBankCheck) throws SQLException;
    void transferBankSavings(Bank transferBankSave) throws SQLException;
    void transferBankCheckandSave(Bank tbCheckingsandSavings) throws SQLException;
    void transferBankSaveandCheck(Bank tbSavingsandCheckings) throws SQLException;
    void addClient(Bank newclient) throws SQLException;
    void deleteClient(int clientId) throws SQLException;
    void updateClient(Bank clientUpdate) throws SQLException;
    List<Bank> getclientInfo() throws SQLException;

}
