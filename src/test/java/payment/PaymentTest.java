package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    Payment creditPayment;
    Payment payPalPayment;
    @BeforeEach
    void setUp() {
        creditPayment = new CreditCardPaymentStrategy();
        payPalPayment = new PayPalPaymentStrategy();
    }

    @Test
    void payCredit() {
        creditPayment.pay(100);
    }

    @Test
    void payPayPal() {
        payPalPayment.pay(21);
    }
}