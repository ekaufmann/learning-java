package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q01 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");

        int n1 = input.nextInt(), n2 = input.nextInt(), aux;

        if (n1 < n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        System.out.println("O maior número digitado foi: " + n1);

        input.close();
    }
}