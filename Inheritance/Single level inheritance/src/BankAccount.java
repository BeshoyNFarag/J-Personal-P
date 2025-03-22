/*1. Single-Level Inheritance (Bank Account System)
Problem:
Create a BankAccount class with attributes accountNumber, balance, and methods deposit() and withdraw().
Create a SavingsAccount class that inherits BankAccount and adds interestRate.
Write a program that:

Creates an instance of SavingsAccount

Deposits and withdraws money

Displays final balance*/



public class BankAccount {
    private long accountNumber;
    private double balance;



    // setters and getters
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance =  balance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }
    public void withdraw(double withdrawAmount){
        if(balance >= withdrawAmount){
            balance -= withdrawAmount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

}
