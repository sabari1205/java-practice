import java.util.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] data = {88, 42, 19, 5, 93, 27, 5};

        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        System.out.println("=== Find Minimum Element in Array ===");
        System.out.println("Array: " + Arrays.toString(data));
        System.out.println("Minimum Element: " + min);
    }
}
