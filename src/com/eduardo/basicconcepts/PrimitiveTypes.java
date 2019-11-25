package com.eduardo.basicconcepts;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // integers
        byte num1 = 5; // 8 bits
        short num2 = 5; // 16 bits
        int num3 = 5; // 32 bits -- mais usado
        long num4 = 5l; // 64 bits -- mais usado

        int val1 = 2147483647; // valor máximo de int positivo
        int val2 = 1;

        System.out.println(val1 + val2);
        System.out.println("-2147483648");

        // floats
        float num5 = 10.32f; // 32 bits
        double num6 = 10.32; // 64 bits -- mais usado
        double num7 = 1.032e1; // notação científica

        // chars
        char i = 'i';
        char i2 = 105;
        char o = 111;
        char interrogacao = 0x00E1; // Unicode

        System.out.println("i = " + i);
        System.out.println("105 = " + i2);
        System.out.println("105 + 111 = " + o + i2 + interrogacao);

        // booleans
        boolean verdadeiro = true;
        boolean falso = false;

        // dec, hex, oct, bin
        int dec = 26;
        int hex = 0x1a;
        int oct = 032;
        int bin = 0b11010;

        System.out.println(dec);
        System.out.println(hex);
        System.out.println(oct);
        System.out.println(bin);

        // escape
        System.out.println("Hello World!");
        System.out.print("\"Hello World!\"\n");
    }

}