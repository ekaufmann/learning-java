package com.eduardo.basicconcepts;

import java.util.Scanner;

public class LerDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é " + nomeCompleto);

        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é " + primeiroNome); */

        System.out.print("Digite seu primeiro nome, sua idade, quanto quer ganhar e um objetivo de vida: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        double salario = scan.nextDouble();
        String objetivo = scan.nextLine();

        System.out.println(primeiroNome + " tem " + idade + " anos e quer ganhar R$ " + salario);
        System.out.println("Um de seus objetivos é: " + objetivo);

        scan.close();
    }
}