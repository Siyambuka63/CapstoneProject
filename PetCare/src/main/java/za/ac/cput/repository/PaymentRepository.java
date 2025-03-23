/* PaymentRepository.java
Payment repository class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import za.ac.cput.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepository implements IRepository<Payment, String> {

    private static PaymentRepository repository;

    private List<Payment> payments;

    private PaymentRepository() {
        payments = new ArrayList<Payment>();
    }

    public static PaymentRepository getRepository() {
        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }

    @Override
    public Payment create(Payment payment) {
        if (payments.add(payment)) {
            return payment;
        }
        return null;
    }

    @Override
    public Payment read(String paymentType) {
        for (Payment payment : payments) {
            if (payment.getPaymentType().equals(paymentType)) {
                return payment;
            }
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        Payment oldPayment = read(payment.getPaymentType());
        if (oldPayment == null) {
            return null;
        }
        Payment deletedPayment = delete(oldPayment.getPaymentType());
        if (deletedPayment == null) {
            return null;
        }
        return create(payment);
    }

    @Override
    public Payment delete(String paymentType) {
        Payment payment = read(paymentType);
        if (payment == null) {
            return null;
        }
        if (payments.remove(payment)) {
            return payment;
        }
        return null;
    }

    @Override
    public List<Payment> getAll() {
        return payments;
    }
}
