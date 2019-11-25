/*
 * 12 - From a person's height input, calculate the BMI (IMC) using (72.7 * height) - 58.
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class BMI {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Height = ");
        double height = input.nextDouble();
        double bmi = (72.7 * height) - 58;

        System.out.printf("BMI = %.2f kg", bmi);

        input.close();
    }
}