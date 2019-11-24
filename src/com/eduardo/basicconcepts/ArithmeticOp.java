public class ArithmeticOp {

    public static void main(String[] args) {

        int res = 8;
        System.out.println(res);
        res += 1; // res = res + 1
        System.out.println(res);
        res ++; // res = res + 1
        System.out.println(res);
        res --; // res = res + 1
        System.out.println(res);
        res -= 1; // res = res - 1
        System.out.println(res);
        res *= 2; // res = res * 2
        System.out.println(res);
        res /= 3; // res = res / 2
        System.out.println(res);
        res *= res; // res = res * res
        System.out.println(res);
        res %= 2; // res = res % 2
        System.out.println(res);

        res = 5;
        System.out.println(res++); // print and add
        System.out.println(++res); // add and print

    }

}