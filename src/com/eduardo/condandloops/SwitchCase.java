package com.eduardo.condandloops;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual dia da semana? [1-7]");
        int dia = input.nextInt();

        switch(dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Dia inválido!");
        }

        switch(dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 7:
            case 1: System.out.println("Fim de semana"); break;            
            default: System.out.println("Dia inválido!");
        }

        input.close();
    }
}