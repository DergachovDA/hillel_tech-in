package ua.in.dergachovda.less05;

public class Main {

    public static void main(String[] args) {
        int n = 100;
        int[] cache = new int[n+1];

        long start = System.nanoTime();
        int result = getSummaIterativety(n);
        System.out.println("The sum is: " + result);
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("Interative duration is: " + duration + " ns");

        start = System.nanoTime();
        result = getFormula(n);
        System.out.println("The sum is: " + result);
        end = System.nanoTime();
        cache[n] = result;
        duration = end - start;

        System.out.println("Formula duration is: " + duration + " ns");

        if (cache[n] != 0) {
            start = System.nanoTime();
            System.out.println("cache = " + cache[n]);
            end = System.nanoTime();
            duration = end - start;
        } else {
            result = getFormula(n);
            cache[n] = result;
        }

        System.out.println("Cache duration is: " + duration + " ns");
    }

    public static int getSummaIterativety(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getFormula(int n) {
        return (1 + n) * n / 2;
    }

}
