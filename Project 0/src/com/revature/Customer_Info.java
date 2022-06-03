package com.revature;

public class Customer_Info {
    private int custId;
    private String custName;
    private String custEmail;
    private int custPassword;

    public Customer_Info(){

    }

    public Customer_Info(int custId, String custName, String custEmail, int custPassword){
        this.custId = custId;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPassword = custPassword;


    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public int getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(int custPassword) {
        this.custPassword = custPassword;
    }

    @Override
    public String toString() {
        return "Customer_Info{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", email='" + custEmail + '\'' +
                ", password=" + custPassword +
                '}';
    }
}
