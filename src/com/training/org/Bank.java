package com.training.org;

public class Bank {
    private String bankName;
    private String bankAddress;
    private int noOfEmployees;

    public Bank(){
        System.out.println("Default constructor of XYZBank is called");
        bankName="";
        bankAddress="";
        noOfEmployees=0;
    }

    public Bank(String bankName, String bankAddress, int noOfEmployees) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployees = noOfEmployees;
    }

    public String toString(){
        return "Bank Details are "+bankName+" Address "+bankAddress+" NoOfEmployees"+noOfEmployees;
    }
}
