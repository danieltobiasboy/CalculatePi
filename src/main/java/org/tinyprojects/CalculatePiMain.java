package org.tinyprojects;

/**
 * Calculates PI to the nth decimal place.
 */
public class CalculatePiMain {

    /**
     * The main method of CalculatePi uses a method from a utility class to calculate
     * PI to the nth decimal place (rounded) and prints the result to console.
     * Accurate up to the 8th place.
     *
     * @param args like all main method this one takes a String array as a parameter. But any parameter
     *             except a single int for n will result in a failure message.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Missing argument. This app calculates PI to the nth decimal. Execute via main -n.");
            return;
        }
        if (args.length > 1) {
            System.out.println("Too many arguments. This app calculates PI to the nth decimal. Execute via main -n.");
            return;
        }
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e){
            System.out.println("Wrong number format argument. This app calculates PI to the nth decimal. Execute via main -n.");
            return;
        }
        System.out.println(CalculatePiUtils.calculatePiToNthDecimalPlace(n));
    }
}