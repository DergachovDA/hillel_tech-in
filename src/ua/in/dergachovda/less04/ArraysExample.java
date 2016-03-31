package ua.in.dergachovda.less04;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 34;
        array[1] = 8;
        array[2] = 81;
        array[3] = 18;
        array[4] = 25;

        int[] array2 = {5, 7, 12};

        for (int i = 0; i < 5; i++) {
            if (i == 3 ) break; // выход из цикла
            if (i == 4 ) continue; // пропустить итерацию цикла
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println("Size of array: " + array2.length);

        for (int element : array2)
            System.out.println(element);
    }
}
