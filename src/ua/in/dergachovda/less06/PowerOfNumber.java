package ua.in.dergachovda.less06;

public class PowerOfNumber {

    public static void main(String[] args) {
        int number = 2;
        int n = 16;

        int current = 1;
        long result = number;

        while (current < n) {
            result *= result;
            current *= 2;
        }

        System.out.println(result);
        System.out.println((long)Math.pow(number, n));

    }

}
