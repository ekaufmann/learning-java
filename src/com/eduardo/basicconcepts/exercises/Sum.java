import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);

        scan.close();
    }
}