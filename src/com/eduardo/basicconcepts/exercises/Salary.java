/*
 * 13 - Leia a o valor por hora e a quantidade de horas trabalhadas no mês. Imprima as informações abaixo:
 *       . Salário bruto
 *      a. INSS
 *      b. Sindicato
 *      c. Salário líquido
 *
 *      obs: tabela de descontos -> Bruto - IR(11%) -> R$ - INSS(8%) -> R$ - Sindicato(5%) -> Líquido
 */

package com.eduardo.basicconcepts.exercises;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Valor da hora = ");
        double valor = input.nextDouble();
        System.out.print("Horas trabalhadas = ");
        double horas = input.nextDouble();

        double salario = valor * horas;
        double ir = 0.11 * salario;
        double inss = (salario - ir) * 0.08;
        double sindicato = ((salario - inss - ir) * 0.05);
        double liquido = salario - ir - inss - sindicato;

        System.out.printf("\nSalário bruto = %.2f\n", salario);
        System.out.printf("Pago ao INSS = %.2f\n", inss);
        System.out.printf("Pago ao sindicato = %.2f\n", sindicato);
        System.out.printf("Salário líquido = %.2f", liquido);

        input.close();
    }
}