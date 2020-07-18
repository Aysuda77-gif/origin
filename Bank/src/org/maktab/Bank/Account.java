package org.maktab.Bank;

public class Account {
    private  String accountNumber;
    private double balance;
    private Branch branch;
    public Account(
            String accountNumber,double balance,String code,String city,int rate){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.branch=new Branch(code,city,rate);
    }
    /***************** SETTER *****************/
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    /***************** GETTER *****************/
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Branch getBranch() {
        return branch;
    }
}
