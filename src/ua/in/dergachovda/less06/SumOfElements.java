package ua.in.dergachovda.less06;

public class SumOfElements {

    public static void main(String[] args) {
        int[] array = {1, 3, 9, 12, 15};
        int n = 15;

        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == n) {
                System.out.println(true);
                return;
            }
            if (sum > n)
                j--;
            else
                i++;
        }

    }

}