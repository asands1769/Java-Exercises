package exercises;

import java.util.Scanner;
public class NumberOfMilesDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int milesDriven = input.nextInt();
        System.out.println("How many gallons of gas have you consumed?");
        int gasConsumed = input.nextInt();
        int milesPerGallon = milesDriven / gasConsumed;
        System.out.println("You have gotten " + milesPerGallon + " miles per gallon.");
    }
}