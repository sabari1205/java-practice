import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] data = {34, 78, 12, 99, 45, 67, 99};

        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("=== Find Maximum Element in Array ===");
        System.out.println("Array: " + Arrays.toString(data));
        System.out.println("Maximum Element: " + max);
    }
}
