package ua.in.dergachovda.less05;

import ua.in.dergachovda.Utils;

public class Sorting {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 7};

        Utils.printArray(sort(array));
        Utils.printArray(insertionSort(array));
        Utils.printArray(selectionSort(array));
    }

    public static int[] sort(int[] array) {
        int operations = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                operations++;
            }
        }
        System.out.println("Sort operations: " + operations);
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int operations = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                operations++;
                if (array[j-1] <= array[j])
                    break;
                int temp = array[j - 1];
                array[j -1] = array[j];
                array[j] = temp;
            }
        }
        System.out.println("Insertion sort operations: " + operations);
        return array;
    }

    public  static int[] selectionSort(int[] array) {
        int operations = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                operations++;
                if (array[j] < array[indexMin])
                    indexMin = j;
                }
                if (indexMin != i) {
                    int tmp = array[i];
                    array[i] = array[indexMin];
                    array[indexMin] = tmp;
                }
            }
        System.out.println("Selection sort operations: " + operations);
        return array;
    }

}
