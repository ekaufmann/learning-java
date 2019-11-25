package com.eduardo.condandloops;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 5 ; i >= 0 ; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 0, j = 10 ; i < j ; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        int contador = 0;
        for ( ; contador < 5 ; ) {
            System.out.println("Contador = " + contador);
            contador += 2;
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("Soma = " + soma);
    }
}