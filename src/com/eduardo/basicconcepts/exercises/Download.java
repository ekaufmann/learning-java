/*
 * 14 - Leia o tamanho de um arquivo(MB) e a velocidade de internet(Mbps) e informe o tempo de download em minutos.
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Download {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nInforme o tamanho do arquivo: ");
        double tamanho = input.nextDouble();
        tamanho *= 8; // tranformar o tamanho de bytes para bits, outra opção seria dividir a velocidade da internet por 8.

        System.out.print("Informe a velocidade: ");
        double velocidade = input.nextDouble();

        double tempo = (tamanho / velocidade) / 60;
        System.out.printf("\nO tempo do download é igual a %.2f minutos.", tempo);

        input.close();
    }
}