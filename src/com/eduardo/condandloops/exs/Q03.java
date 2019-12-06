package com.eduardo.condandloops.exs;

import java.util.Scanner;

public class Q03 {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite F para feminino ou M para masculino: ");
        String letra = input.next();

        switch(letra){
            case "f":
            case "F": System.out.println(letra + " - Feminino"); break;
            case "m":
            case "M": System.out.println(letra + " - Masculino"); break;
            default: System.out.println(letra + " - Sexo Inválido");
        }

        input.close();
    }
}
