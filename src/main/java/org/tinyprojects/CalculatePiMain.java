package org.tinyprojects;

public class CalculatePiMain {
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
        System.out.println(CalculatePiUtils.calculatePiToNthDecimalPoint(n));
    }
}