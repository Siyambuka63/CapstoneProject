package za.ac.cput.util;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isAmountValid(double amount) {return amount > 0;}

    public static boolean isPaymentTypeValid(String type) {
        return (type.equalsIgnoreCase("cash") || type.equalsIgnoreCase("credit") || type.equalsIgnoreCase("debit"));
    }

}

