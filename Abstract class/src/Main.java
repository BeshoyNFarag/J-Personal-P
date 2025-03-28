/*
* Task 1: Abstract Class
Create a simple banking system using an abstract class.

Create an abstract class BankAccount with:

An integer balance

A constructor to initialize the balance

An abstract method withdraw(int amount)

A concrete method deposit(int amount) that adds to the balance

Create a subclass SavingsAccount that:

Implements the withdraw method with a rule: Withdrawal should not reduce the balance below $500.

In main(), create a SavingsAccount object, deposit some money, and try withdrawing an amount.*/


public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1250.75);
        acc.getBalance();
        acc.deposit(250.25);
        acc.getBalance();
        acc.withdraw(301);
        acc.getBalance();



    }
}