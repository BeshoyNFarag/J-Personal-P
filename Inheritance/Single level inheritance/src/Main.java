/*1. Single-Level Inheritance (Bank Account System)
Problem:
Create a BankAccount class with attributes accountNumber, balance, and methods deposit() and withdraw().
Create a SavingsAccount class that inherits BankAccount and adds interestRate.
Write a program that:

Creates an instance of SavingsAccount

Deposits and withdraws money

Displays final balance*/



import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        SavingsAccount sacc = new SavingsAccount();




        sacc.setBalance(500);
        sacc.deposit(200);
        sacc.withdraw(50);
        System.out.println(sacc.getBalance());
        sacc.interestAmount(1.025);


    }
}