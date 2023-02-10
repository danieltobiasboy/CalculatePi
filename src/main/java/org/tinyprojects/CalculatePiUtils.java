package org.tinyprojects;

public abstract class CalculatePiUtils {
    private static long MIN_ACCURACY = 10000000;
    private static long MAX_ACCURACY = 1000000000;

    public static double calculatePiToNthDecimalPoint(int n) {
        double result;
        long accuracy = Math.round(Math.pow(n+2,n+1));
        if (accuracy < MIN_ACCURACY) accuracy = MIN_ACCURACY;
        if (accuracy > MAX_ACCURACY) accuracy = MAX_ACCURACY;
        double myPi = calcPi(accuracy);

        if (n < 1) return Math.round(myPi);
        //round to the nth decimal
        result = myPi * (Math.pow(10,n));
        result = Math.round(result);
        System.out.println(result);
        result /= Math.pow(10,n);

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
