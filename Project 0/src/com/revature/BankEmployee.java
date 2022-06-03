package com.revature;

public class BankEmployee {
    private int empId;
    private String empName;
    private String empEmail;
    private int empAdminID;

    public BankEmployee(){

    }

    public BankEmployee(int empId, String empName, String empEmail, int empAdminID){
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empAdminID = empAdminID;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmpAdminID() {
        return empAdminID;
    }

    public void setEmpAdminID(int empAdminID) {
        this.empAdminID = empAdminID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empAdminID=" + empAdminID +
                '}';
    }
}
