package com.eduardo.condandloops;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você não é maior de idade!");
        } */

        System.out.print("Entre com o preço do produto: ");
        double preco = input.nextDouble();

        if (preco <= 10){
            System.out.println("Produto com preço bom, pode levar!");
        } else if (preco < 15){
            System.out.println("Produto com preço bom, mas pode pedir um desconto!");
        } else if (preco < 17){
            System.out.println("Preço não tão bom, pesquisar mais!");
        } else {
            System.out.println("Produto com valor bem elevado!");
        }

        input.close();
    }
}