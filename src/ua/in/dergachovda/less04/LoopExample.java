package ua.in.dergachovda.less04;

import java.util.Scanner;

public class LoopExample {

    public static void main(String[] args) {

        int a = 0;

        while (a <= 5) {
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a);
            a++;
        } while (a <= 7);


        for  (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

    }

}
