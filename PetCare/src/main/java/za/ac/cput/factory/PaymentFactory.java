package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

public class PaymentFactory {
    public static Payment createPayment(String paymentType, double amount) {
        if (!Helper.isAmountValid(amount)) return null;
        if (Helper.isNullOrEmpty(paymentType)) return null;
        return new Payment.Builder().setPaymentType(paymentType).setAmount(amount).build();
    }
}
