/*
 * 02 - Read a number and print it.
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("O número digitado foi: " + num);

        scan.close();
    }
}