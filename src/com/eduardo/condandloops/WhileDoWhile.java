package com.eduardo.condandloops;

public class WhileDoWhile {

    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println(i);

        do {
            i++;
            System.out.println("i = " + i);
        } while (i <= 15);

        System.out.println(i);
    }
}