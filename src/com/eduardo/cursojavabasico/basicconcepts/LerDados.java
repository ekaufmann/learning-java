import java.util.Scanner;

public class LerDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome é " + nomeCompleto);

        scan.close();
    }
}