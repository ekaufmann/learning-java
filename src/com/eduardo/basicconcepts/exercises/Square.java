/*
 * 07 - Find the square area from a given side and return the double of it.
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Square{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado: ");
        double lado = input.nextDouble();
        double area = Math.pow(lado, 2);

        System.out.printf("\nO quadrado de lado %.2f tem área igual a %.2f.\n", lado, area);
        System.out.printf("O dobro da área calculada é %.2f.", (2 * area));

        input.close();        
    }
}