package org.launchcode;
import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle length:");
        Integer rectLength = input.nextInt();
        System.out.println("Rectangle width:");
        Integer rectWidth = input.nextInt();
        Integer rectArea = rectLength * rectWidth;
        System.out.println("The area of your rectangle is " + rectArea);
    }
}
