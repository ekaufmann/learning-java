/*
 * 04 - Read four grades and find the average.
 */

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 4 notas com uma casa decimal: ");
        double n1 = scan.nextDouble();
        //System.out.print("");
        double n2 = scan.nextDouble();
        //System.out.print("");
        double n3 = scan.nextDouble();
        //System.out.print("");
        double n4 = scan.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("A média é: %.2f", media);

        scan.close();
    }
}