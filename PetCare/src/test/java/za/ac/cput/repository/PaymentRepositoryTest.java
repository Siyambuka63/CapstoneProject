/* PaymentRepositoryTest.java
Payment repository test class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PaymentRepositoryTest {

    private static PaymentRepository paymentRepository = PaymentRepository.getRepository();

    private static Payment payment = PaymentFactory.createPayment("Cash", 100);

    @Test
    @Order(1)
    void create() {
        Payment createdPayment = paymentRepository.create(payment);
        assertNotNull(payment);
        System.out.println(payment);
    }

    @Test
    @Order(2)
    void read() {
        Payment readPayment = paymentRepository.read(payment.getPaymentType());
        assertNotNull(readPayment);
        System.out.println(readPayment);
    }

    @Test
    @Order(3)
    void update() {
        Payment newPayment = PaymentFactory.createPayment("Cash", 200);
        Payment updatedPayment = paymentRepository.update(newPayment);
        assertNotNull(updatedPayment);
        System.out.println(updatedPayment);
    }

    @Test
    @Order(4)
    void delete() {
        Payment deletedPayment = paymentRepository.delete(payment.getPaymentType());
        assertNotNull(deletedPayment);
        System.out.println(deletedPayment);
    }

    @Test
    @Order(5)
    void getAll() {
        List<Payment> payments = paymentRepository.getAll();
        assertNotNull(payments);
        System.out.println(payments);
    }
}