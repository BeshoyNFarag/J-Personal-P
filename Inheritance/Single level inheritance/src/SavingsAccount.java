/*1. Single-Level Inheritance (Bank Account System)
Problem:
Create a BankAccount class with attributes accountNumber, balance, and methods deposit() and withdraw().
Create a SavingsAccount class that inherits BankAccount and adds interestRate.
Write a program that:

Creates an instance of SavingsAccount

Deposits and withdraws money

Displays final balance*/



public class SavingsAccount extends BankAccount {
    double interestRate ;
    public void interestAmount(double interestRate) {
        this.interestRate = interestRate;
        double last = interestRate * getBalance();
        System.out.printf("Account balance with interest rate is %f ", last );

    }

}
