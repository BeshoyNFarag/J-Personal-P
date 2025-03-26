/*
* 5. Polymorphism
Task: Implement a Payment system using method overloading and overriding.

Create a Payment class with a method pay(int amount).

Overload pay() by adding another version pay(int amount, String currency).

Create CreditCardPayment subclass and override pay(int amount).

Demonstrate polymorphism by calling overridden and overloaded methods.

*/

public class CreditCard {


    public int pay(int amount){
        return amount * 2;
    }
}
