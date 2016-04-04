package ua.in.dergachovda.less05;

public class Main {

    public static void main(String[] args) {
        long start = System.nanoTime();
        int result = getSummaIterativety();
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("The sum is: " + result);
        System.out.println("Interative duration is: " + duration + " ns");

        start = System.nanoTime();
        result = getSummaIterativety();
        end = System.nanoTime();
        duration = end - start;
        
        System.out.println("The sum is: " + result);
        System.out.println("Interative duration is: " + duration + " ns");
    }

    public static int getSummaIterativety() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getFormula() {
        return (1 + 100) * 100 / 2;
    }

}
