package ua.in.dergachovda.less04;

public class DigitsTask {
    public static void main(String[] args) {

        int number = 876;

        int result = 0;

        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        System.out.println("result = " + result);
    }
}
