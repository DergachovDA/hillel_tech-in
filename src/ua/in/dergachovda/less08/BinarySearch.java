package ua.in.dergachovda.less08;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 8, 12};
        boolean result;
        int n = 8;
        result = search(array, n, 0, array.length - 1);
        if (result)
            System.out.println("Element found");
        else
            System.out.println("There is no such an element");

    }

    public static boolean search(int[] array, int value, int min, int max) {
        int mid = (min + max) / 2;
        if (array[mid] == value) return true;
        if (min >= max) return false;
        if (array[mid] > value)
            return search(array, value, min, mid - 1);
        else
            return search(array, value, mid + 1, max);
    }

}
