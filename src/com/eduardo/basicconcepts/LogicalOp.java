public class LogicalOp {

    public static void main(String[] args) {

        int val1 = 1;
        int val2 = 2;
        boolean res = (val1 == 1) && (val2 == 2);
        boolean res2 = (val1 == 1) || (val2 == 2);
        System.out.println(res + " " + res2);

        res = (val1 == 1) && (val2 != 2);
        System.out.println(res);

        res = true;
        res2 = false;
        System.out.println(res ^ res2); // XOR
        System.out.println(res ^ !res2);

    }
}