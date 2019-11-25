/*
 * 08 - Calculate your salary giving how much you earn per hour and the amount of hours worked in the month.
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Income {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Amount per hour = ");
        double amount = input.nextDouble();
        System.out.print("Worked hours = ");
        double hours = input.nextDouble();

        double salary = amount * hours;
        System.out.printf("Your salary this month is $%.2f.", salary);

        input.close();
    }
}