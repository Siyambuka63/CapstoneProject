package za.ac.cput.util;

import java.time.LocalDate;
import java.time.LocalTime;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
    public static boolean isIDValid(String id) {
        try {
            Integer.parseInt(id);
        } catch (NumberFormatException e) {
            return false;
        }
        return id.length() == 4;
    }

    public static boolean isAmountValid(double amount) {return amount > 0;}

    public static boolean isPaymentTypeValid(String paymentType) {
        return false;
    }

    public static boolean isValidDate(LocalDate date) {
        return date != null && !date.isBefore(LocalDate.now());
    }

    public static boolean isValidTime(LocalTime time) {
        return time != null && time.isAfter(LocalTime.MIN) && time.isBefore(LocalTime.MAX);
    }

}

