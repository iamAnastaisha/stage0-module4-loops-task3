package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int number = 0;
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            number = number * 10 + 9;
            sum += number;
        }
        System.out.println(sum);
    }
}
