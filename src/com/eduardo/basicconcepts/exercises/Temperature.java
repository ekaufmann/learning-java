/*
 * 09 - Convert the temperature to Celsius from Farenheit (C = (5 * (F - 32) / 9)).
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Farenheit degrees = ");
        double F = input.nextDouble();

        double C = 5 * (F - 32) / 9;
        System.out.printf("Celsius degrees = %.2f", C);

        input.close();
    }
}