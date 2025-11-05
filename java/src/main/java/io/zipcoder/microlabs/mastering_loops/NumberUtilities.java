package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String s = "";

        for (int i = start; i < stop; i=i+step) {
            s = s + String.valueOf((int) Math.pow(i, exponent));
        }
        return s;
    }

    public static String getRange(int start, int stop, int step) {
        String s = "";

        for (int i = start; i < stop; i=i+step) {
            s = s + String.valueOf(i);
        }
        return s;
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) { 
        if (toTest % 2 == 0) {
            return true;
        } else {
        return false; 
        }
    }
    public static boolean isNumberOdd(int toTest) { 
        if (toTest % 2 == 1) {
            return true;
        } else {
        return false; 
        }
    }

    public static String getEvenNumbers(int start, int stop) {
        String s = "";

        for (int i = start; i < stop; i=i+1) {
            if (isNumberEven(i)) {
             s = s + String.valueOf(i);
            }
        }
        return s;
    }

    public static String getOddNumbers(int start, int stop) {
        String s = "";

        for (int i = start; i < stop; i=i+1) {
            if (isNumberOdd(i)) {
             s = s + String.valueOf(i);
            }
        }
        return s;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

}