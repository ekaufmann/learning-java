package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println(num + " é negativo!");
        } else {
            System.out.println(num + " é positivo!");
        }

        input.close();
    }
}