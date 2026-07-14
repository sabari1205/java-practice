import java.util.Arrays;

public class ArrayAggregateProblems {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};

        int sum = 0;
        int min = scores[0];
        int max = scores[0];
        int evenCount = 0;
        int oddCount = 0;

        for (int score : scores) {
            sum += score;
            if (score < min) min = score;
            if (score > max) max = score;
            if (score % 2 == 0) evenCount++;
            else oddCount++;
        }

        double average = (double) sum / scores.length;

        System.out.println("=== Array Aggregate Problems Summary ===");
        System.out.println("Dataset: " + Arrays.toString(scores));
        System.out.println("Total Elements: " + scores.length);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.println("Even Scores Count: " + evenCount);
        System.out.println("Odd Scores Count: " + oddCount);
    }
}
