package za.ac.cput.util;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isDoubleNotValid(double d) {
        if (d < 0) return true;
        return false;
    }
}

