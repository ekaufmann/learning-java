/*
 * 11 - Get two integers(a, b) and one float(c) and calculate:
 *
 *      1 -> (2*a)*(b/2);
 *      2 -> (3*a)+c;
 *      3 -> (c*c*c);
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Nums {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite dois números inteiros e um real: ");
        int a = input.nextInt(), b = input.nextInt();
        double c = input.nextDouble();

        System.out.println("\n1 -> (2*a)*(b/2) = " + ((2 * a) * (b / 2)));
        System.out.println("2 -> (3*a)+c = " + ((3 * a) + c));
        System.out.println("3 -> (c^3) = " + (Math.pow(c, 3)));

        input.close();
    }
}