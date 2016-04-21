package ua.in.dergachovda.less10;

import java.util.Arrays;

public class ArraysCopyExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        arrayCopy = array;
        array[3] = 0;
    }

}
