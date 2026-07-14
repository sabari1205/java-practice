import java.util.Arrays;

public class FindMinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, -5, 63, 100, 23};
        
        if (numbers.length == 0) return;
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        System.out.println("=== Find Min / Max Element in Array ===");
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}
