package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = Math.abs(t);
        for (int i = 0; i < Integer.toString(t).length(); i++) {
            sum += t % 10;
            t /= 10;
        }
        System.out.println(sum);
    }
}
