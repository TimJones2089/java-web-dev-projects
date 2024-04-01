package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of miles driven:");
        Integer milesDriven = input.nextInt();

        System.out.println("Amount of gas consumed:");
        Integer gasConsumed = input.nextInt();

        Integer milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Your miles per gallon is " + milesPerGallon);
    }
}
