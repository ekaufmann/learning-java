/*
 * 05 - Convert meters to centimeters.
 */

package com.eduardo.basicconcepts.exs;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos metros quer converter para centímetros: ");
        double metros = scan.nextDouble();
        double cent = metros * 100;

        System.out.printf("%.2f metros é o mesmo que %.2f centímetros", metros, cent);

        scan.close();
    }
}