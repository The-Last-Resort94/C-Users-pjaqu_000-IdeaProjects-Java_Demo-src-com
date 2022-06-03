package com.revature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserPortalDaoImpl implements UserPortalDao {

    Connection connection;

    public UserPortalDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }
    @Override
    public void userLogin(BankEmployee empEmail) throws SQLException {
        String sql = "select empEmail, empAdminID from Employee";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(3, empEmail.getEmpEmail());
        preparedStatement.setInt(4, empEmail.getEmpAdminID());
    }

    @Override
    public void userPassword(BankEmployee empAdminID) throws SQLException {

    }

    @Override
    public void custLogin(Customer_Info custEmail) throws SQLException {

    }

    @Override
    public void custRegistration(Customer_Info addCustomer) throws SQLException {

    }

    @Override
    public void custPassword(Customer_Info custPassword) throws SQLException {

    }

    @Override
    public void viewcurrentCheckings(Bank viewClientCheck) throws SQLException {

    }

    @Override
    public void viewcurrentSavings(Bank viewClientSaving) throws SQLException {

    }

    @Override
    public void custwithdrawCheck(Bank drawclientCheck) throws SQLException {

    }

    @Override
    public void custdepositCheck(Bank depoclientCheck) throws SQLException {

    }

    @Override
    public void custtransferCheck(Bank tranclientCheck) throws SQLException {

    }

    @Override
    public void custwithdrawSave(Bank drawclientSave) throws SQLException {

    }

    @Override
    public void custdepositSave(Bank depoclientSave) throws SQLException {

    }

    @Override
    public void custtransferSave(Bank tranclientSave) throws SQLException {

    }

    @Override
    public List<Customer_Info> getCustomer_Info() throws SQLException {
        return null;
    }

    @Override
    public List<Bank> getBank() throws SQLException {
        return null;
    }

    @Override
    public List<BankEmployee> getBankEmployee() throws SQLException {
        return null;
    }
}
