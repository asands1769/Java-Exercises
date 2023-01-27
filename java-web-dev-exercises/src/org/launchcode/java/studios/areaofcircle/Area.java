package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("What is the radius of the circle?");
        while(1 == 1) {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius > 0) {
                    break;
                }
                else {
                    System.out.println("Please enter positive number:");
                }
            }
            else {
                System.out.println("Please enter proper numerical answer:");
                input.nextLine();
            }
        }
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        input.close();
    }
}