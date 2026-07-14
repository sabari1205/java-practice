import java.util.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {5, 15, 25, 35};

        // 1. Total sum of all elements in both arrays
        int totalSum = 0;
        for (int num : array1) totalSum += num;
        for (int num : array2) totalSum += num;

        // 2. Element-wise sum of two arrays
        int[] elementWiseSum = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            elementWiseSum[i] = array1[i] + array2[i];
        }

        System.out.println("=== Sum of Array of 2 Arrays ===");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Total Combined Sum: " + totalSum);
        System.out.println("Element-wise Sum Array: " + Arrays.toString(elementWiseSum));
    }
}
