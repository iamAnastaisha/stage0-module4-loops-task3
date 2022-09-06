package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci >= 1) {
            System.out.println(0);
        }
        if (lastFibonacci >= 2) {
            System.out.println(1);
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i < lastFibonacci; i++) {
            int fact = first + second;
            System.out.println(fact);
            first = second;
            second = fact;
        }
    }
}
