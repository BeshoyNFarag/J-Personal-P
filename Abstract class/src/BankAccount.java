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



abstract public class BankAccount {
    protected double balance;
    protected double amount;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    abstract public void withdraw(double amount);
    public void deposit(double amount) {
        this.amount = amount;
        balance += amount;
    }
}
