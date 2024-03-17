package com.DkAngelo.exercises.OOP;

public class BankAccount {
    double balance;

    public BankAccount() {
        this.balance = 0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
}
