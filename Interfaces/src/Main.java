/*
In the main method, create objects of CreditCardPayment, PayPalPayment, and UPIPayment.

Use PaymentProcessor to process payments with different methods.
*/


interface PaymentMethod{
    void pay (double amount);

}

class Paypal implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paying: "+ amount + " using Paypal" );
    }
}

class UPI implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paying: "+ amount + " using UPI" );
    }
}

class CreditCard implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Paying: "+ amount + " using Credit Card" );
    }
}

class PaymentProcessor{
    public void processPayment(PaymentMethod objType, double amount){
        objType.pay(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod paypal = new Paypal();
        PaymentMethod upi = new UPI();
        PaymentMethod creditCard = new CreditCard();
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(paypal, 120);
        processor.processPayment(upi, 130);
        processor.processPayment(creditCard, 140);
    }
}