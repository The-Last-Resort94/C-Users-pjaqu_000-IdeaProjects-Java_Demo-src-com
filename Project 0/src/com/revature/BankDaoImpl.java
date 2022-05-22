package com.revature;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankDaoImpl implements BankDao {

    Connection connection;

    public BankDaoImpl(){
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void withdrawBankChecking(Bank drawBankChecking) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, drawBankChecking.getClientID());
        preparedStatement.setString(2, drawBankChecking.getClientName());
        preparedStatement.setInt(3, drawBankChecking.getClientCheck());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Withdraw from checking successful");
        else
            System.out.println("WITHDRAWAL FAILED");
    }

    @Override
    public void depositBankChecking(Bank depoBankChecking) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, depoBankChecking.getClientID());
        preparedStatement.setString(2, depoBankChecking.getClientName());
        preparedStatement.setInt(3, depoBankChecking.getClientCheck());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Deposit into checking successful");
        else
            System.out.println("DEPOSIT FAILED");
    }

    @Override
    public void withdrawBankSavings(Bank drawBankSavings) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, drawBankSavings.getClientID());
        preparedStatement.setString(2, drawBankSavings.getClientName());
        preparedStatement.setInt(3, drawBankSavings.getClientCheck());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Withdraw from savings successful");
        else
            System.out.println("WITHDRAWAL FAILED");
    }

    @Override
    public void depositBankSavings(Bank depoBankSavings) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, depoBankSavings.getClientID());
        preparedStatement.setString(2, depoBankSavings.getClientName());
        preparedStatement.setInt(3, depoBankSavings.getClientCheck());
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("Deposit into savings successful");
        else
            System.out.println("DEPOSIT FAILED");

    }

    @Override
    public void transferBankChecking(Bank transferBankCheck) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, transferBankCheck.getClientID());
        preparedStatement.setString(2, transferBankCheck.getClientName());
        preparedStatement.setInt(3, transferBankCheck.getClientCheck());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Transfer to " + getclientInfo() + " successful");
        else
            System.out.println("TRANSACTION FAILED");
    }

    @Override
    public void transferBankSavings(Bank transferBankSave) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, transferBankSave.getClientID());
        preparedStatement.setString(2, transferBankSave.getClientName());
        preparedStatement.setInt(3, transferBankSave.getClientSave());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Transfer to " + getclientInfo() + " successful");
        else
            System.out.println("TRANSACTION FAILED");
    }

    @Override
    public void transferBankCheckandSave(Bank tbCheckingsandSavings) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, tbCheckingsandSavings.getClientID());
        preparedStatement.setString(2, tbCheckingsandSavings.getClientName());
        preparedStatement.setInt(3, tbCheckingsandSavings.getClientCheck());
        preparedStatement.setInt(4, tbCheckingsandSavings.getClientSave());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Transfer to checkings successful");
        else
            System.out.println("TRANSACTION FAILED");
    }

    @Override
    public void transferBankSaveandCheck(Bank tbSavingsandCheckings) throws SQLException {
        String sql = "select * from Bank";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, tbSavingsandCheckings.getClientID());
        preparedStatement.setString(2, tbSavingsandCheckings.getClientName());
        preparedStatement.setInt(3, tbSavingsandCheckings.getClientSave());
        preparedStatement.setInt(4, tbSavingsandCheckings.getClientCheck());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Transfer to savings successful");
        else
            System.out.println("TRANSACTION FAILED");
    }

    @Override
    public void addClient(Bank newclient) throws SQLException {
        String sql = "insert into Bank (clientName, clientCheck, clientSave) values (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, newclient.getClientName());
        preparedStatement.setInt(3, newclient.getClientCheck());
        preparedStatement.setInt(4, newclient.getClientSave());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("New client registered");
        else
            System.out.println("REGISTRATION FAILED");
    }

    @Override
    public void deleteClient(int clientId) throws SQLException {
        String sql = "delete from Bank where clientID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, clientId);
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Client deleted");
        else
            System.out.println("Whoops! Something went wrong...");
    }

    @Override
    public void updateClient(Bank clientUpdate) throws SQLException {
        String sql = "update Bank set clientName = ?, clientCheck = ?, clientSave = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, clientUpdate.getClientName());
        preparedStatement.setInt(2, clientUpdate.getClientCheck());
        preparedStatement.setInt(3, clientUpdate.getClientSave());
        int count = preparedStatement.executeUpdate();
        if(count > 0)
            System.out.println("Client information updated");
        else
            System.out.println("Whoops! Something went wrong...");
    }

    @Override
    public List<Bank> getclientInfo() throws SQLException {
        List<Bank> banks = new ArrayList<>();
        String sql = "select * from banks";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int clientID = resultSet.getInt(1);
            String clientName = resultSet.getString(2);
            int clientCheck = resultSet.getInt(3);
            int clientSave = resultSet.getInt(4);
        }
        return banks;
    }

}
