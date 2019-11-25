/*
 * 10 - Convert the temperature to Farenheit from Celsius (((9 * C) / 5) + 32).
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Temperature2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Celsius degrees = ");
        double C = input.nextDouble();

        double F = ((9 * C) / 5) + 32;
        System.out.printf("Farenheit degrees = %.2f", F);

        input.close();
    }
}