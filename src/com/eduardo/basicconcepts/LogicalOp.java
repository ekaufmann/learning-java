package com.eduardo.basicconcepts;

public class LogicalOp {

    public static void main(String[] args) {

        int val1 = 1;
        int val2 = 2;
        boolean res = (val1 == 1) && (val2 == 2);
        boolean res2 = (val1 == 1) || (val2 == 2);
        System.out.println(res + " " + res2);

        res = (val1 != 1) && (val2 == 2); // && verifies the first statement, if it's false then it will not verifies the second statement.
        System.out.println(res);

        res = (val1 != 1) & (val2 == 2); // & verifies both statements, even when the first is false.
        System.out.println(res);

        res = true;
        res2 = false;
        System.out.println(res ^ res2); // XOR - return true if the statements are not equal and false when equal.
        System.out.println(res ^ !res2);

    }
}