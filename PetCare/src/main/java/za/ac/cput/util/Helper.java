package za.ac.cput.util;

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

    public static boolean isPaymentTypeValid(String type) {
        return (type.equalsIgnoreCase("cash") || type.equalsIgnoreCase("credit") || type.equalsIgnoreCase("debit"));
    }

}

