

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

public class SavingsAccount extends BankAccount {


    public SavingsAccount(double balance) {
        super(balance);
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance)
            balance -= withdrawAmount;
        else
            System.out.println("Insufficient balance");
    }
    public void getBalance(){
        System.out.println(balance);
    }

}
