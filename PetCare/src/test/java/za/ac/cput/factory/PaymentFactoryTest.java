/* PaymentFactoryTest.java
Payment factory test class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {

    private Payment paymentWithInvalidPaymentType = PaymentFactory.createPayment("Crypto",100);
    private Payment paymentWithInvalidAmount = PaymentFactory.createPayment("Cash",-100);
    private Payment paymentWithoutAmount = PaymentFactory.createPayment("Cash",0);
    private Payment paymentWithoutPaymentType = PaymentFactory.createPayment("",100);
    private Payment payment = PaymentFactory.createPayment("Cash", 100);

    @Test
    void testCreatePayment() {
        assertNotNull(payment);
        System.out.println(payment);
    }

    @Test
    void testCreatePaymentWithInvalidPaymentType() {
        assertNotNull(paymentWithInvalidPaymentType);
        System.out.println(paymentWithInvalidPaymentType);
    }

    @Test
    void testCreatePaymentWithInvalidAmount() {
        assertNotNull(paymentWithInvalidAmount);
        System.out.println(paymentWithInvalidAmount);
    }

    @Test
    void testCreatePaymentWithoutPaymentType() {
        assertNotNull(paymentWithoutPaymentType);
        System.out.println(paymentWithoutPaymentType);
    }

    @Test
    void testCreatePaymentWithoutAmount() {
        assertNotNull(paymentWithoutAmount);
        System.out.println(paymentWithoutAmount);
    }
}