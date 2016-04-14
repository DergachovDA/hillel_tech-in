package ua.in.dergachovda.less08;

//  1   1   2   3   5   8   13  21  34  55  89
//  1   2   3   4   5   6   7   8   9   10  11  | n

public class Fibonacci {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n < 3) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
