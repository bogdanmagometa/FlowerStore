import payment.CreditCardPaymentStrategy;
import payment.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPaymentStrategy();
        payment.pay(10);
    }
}
