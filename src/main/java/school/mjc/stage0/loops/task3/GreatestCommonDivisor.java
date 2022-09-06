package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = first > second ? first : second;
        for (int i = max; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
