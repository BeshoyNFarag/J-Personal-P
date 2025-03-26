/*
* 5. Polymorphism
Task: Implement a Payment system using method overloading and overriding.

Create a Payment class with a method pay(int amount).

Overload pay() by adding another version pay(int amount, String currency).

Create CreditCardPayment subclass and override pay(int amount).

Demonstrate polymorphism by calling overridden and overloaded methods.

*/



public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        CreditCard creditCard = new CreditCard();

        System.out.println(payment.pay(100));
        payment.pay(100, "USD");

        System.out.println(creditCard.pay(100));

    }
}