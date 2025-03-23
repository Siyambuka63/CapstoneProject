/* Payment.java
Payment model class
Author: Siyambuka Mbali (230594646)
Date: 23 March 2025
*/

package za.ac.cput.domain;

public class Payment {
    private double amount;
    private String paymentType;

    private Payment() {}

    private Payment(Builder builder){
        this.amount = builder.amount;
        this.paymentType = builder.paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }

    public static class Builder {
        private double amount;
        private String paymentType;

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Payment build() {return new Payment(this); }
    }

}
