public class Variables {

    public static void main(String[] args) {

        int idade = 97;
        //int $idade;
        //int _idade;
        String nome = "Meu nome."; // not a primitive type, String is a java class
        String nomeCachorro = "Nome do cachorro."; // camelCase
        char caracter1 = '\uffff';
        char caracter2 = 'B';
        char caracter3 = '\u0013';
        
        idade = 93;

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Cachorro: " + nomeCachorro);
        System.out.println("Char 1: " + caracter1);
        System.out.println("Char 2: " + caracter2);
        System.out.println("Char 3: " + caracter3);

    }

}