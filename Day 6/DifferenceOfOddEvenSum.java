import java.util.Arrays;

public class DifferenceOfOddEvenSum {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35};

        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        int difference = Math.abs(evenSum - oddSum);

        System.out.println("=== Difference of Odd and Even Number Sum ===");
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
        System.out.println("Absolute Difference: " + difference);
    }
}
