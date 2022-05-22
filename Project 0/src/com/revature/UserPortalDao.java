package com.revature;

import java.sql.SQLException;
import java.util.List;

public interface UserPortalDao {
    void userLogin(BankEmployee empEmail) throws SQLException;
    void userPassword(BankEmployee empAdminID) throws SQLException;
    void custLogin(Customer_Info custEmail) throws SQLException;
    void custRegistration(Customer_Info addCustomer) throws SQLException;
    void custPassword(Customer_Info custPassword) throws SQLException;
    void viewcurrentCheckings(Bank viewClientCheck) throws SQLException;
    void viewcurrentSavings(Bank viewClientSaving) throws SQLException;
    void custwithdrawCheck(Bank drawclientCheck) throws SQLException;
    void custdepositCheck(Bank depoclientCheck) throws SQLException;
    void custtransferCheck(Bank tranclientCheck) throws SQLException;
    void custwithdrawSave(Bank drawclientSave) throws SQLException;
    void custdepositSave(Bank depoclientSave) throws SQLException;
    void custtransferSave(Bank tranclientSave) throws SQLException;
    List<Customer_Info> getCustomer_Info() throws SQLException;
    List<Bank> getBank() throws SQLException;
    List<BankEmployee> getBankEmployee() throws SQLException;
}
