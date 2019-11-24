/*
 * 06 - Circle area.
 */

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.2f", area);

        scan.close();
    }
}