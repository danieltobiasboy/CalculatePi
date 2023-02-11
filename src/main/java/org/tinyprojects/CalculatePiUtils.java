package org.tinyprojects;
/**
 * Utility class for CalculatePiMain. The approximation accuracy can be modified via the fields
 * MIN_ACCURACY and MAX_ACCURACY.
 */
public abstract class CalculatePiUtils {
    private final static long MIN_ACCURACY = 10000000;
    private final static long MAX_ACCURACY = 1000000000;

    /**
     * This method calculates an approximate solution for PI via the Leibniz series.
     * The main method of CalculatePi calculates PI to the nth decimal place and prints the result to console.
     * This setup enables correct results up to the 8th place.
     *
     * @param n The decimal place to which we round PI. Computational complexity rises with n but is bounded by
     *          MIN_ACCURACY and MAX_ACCURACY.
     */
    public static double calculatePiToNthDecimalPlace(int n) {
        double result;
        long accuracy = Math.round(Math.pow(n + 2, n + 1));
        //accuracy bounded checks
        if (accuracy < MIN_ACCURACY) accuracy = MIN_ACCURACY;
        if (accuracy > MAX_ACCURACY) accuracy = MAX_ACCURACY;

        double myPi = calcPi(accuracy);

        if (n < 1) return Math.round(myPi);
        //round to the nth decimal
        result = myPi * (Math.pow(10, n));
        result = Math.round(result);
        result /= Math.pow(10, n);

        return result;
    }

    private static double calcPi(long accuracy) {
        double myPi = 0.0;
        for (long i = accuracy; i > 0; i--) {
            myPi += Math.pow(-1, i + 1) / (2 * i -1);
            if (i == 1) myPi *= 4;
        }
        return myPi;
    }
}
