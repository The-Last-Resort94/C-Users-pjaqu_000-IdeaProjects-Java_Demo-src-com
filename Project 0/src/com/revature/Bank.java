package com.revature;

public class Bank {
    private int clientID;
    private String clientName;
    private int clientCheck;
    private int clientSave;


    public Bank() {

    }

    public Bank(int clientId, String clientName, int clientCheck, int clientSave) {
        this.clientID = clientId;
        this.clientName = clientName;
        this.clientCheck = clientCheck;
        this.clientSave = clientSave;


    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientCheck() {
        return clientCheck;
    }

    public void setClientCheck(int clientCheck) {
        this.clientCheck = clientCheck;
    }

    public int getClientSave() {
        return clientSave;
    }

    public void setClientSave(int clientSave) {
        this.clientSave = clientSave;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clientId=" + clientID +
                ", clientName='" + clientName + '\'' +
                ", checkings=" + clientCheck +
                ", savings=" + clientSave +
                '}';
    }
}
