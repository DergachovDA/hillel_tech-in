package ua.in.dergachovda.less08;

public class StackOverflow {

    public static void main(String[] args) {
        func(0);
    }

    public static void func(int n) {
        n++;
        func(n);
    }

}
