package payment;

public class CreditCardPaymentStrategy implements Payment {
    public boolean pay(double price) {
        System.out.format("Payed %f with credit card", price);
        return true;
    }
}
