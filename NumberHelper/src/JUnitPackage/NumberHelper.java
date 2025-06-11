package JUnitPackage;

public class NumberHelper {

    // even or odd
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //positive or negative (or zero)
    public static String checkSign(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }

    // is it within range?
    public static boolean isWithinRange(int number) {
        if (number >= 10 && number <= 100) {
            return true;
        } else {
            return false;
        }
    }
}

