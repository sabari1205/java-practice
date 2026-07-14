import java.util.Arrays;

public class SwapAndReverseElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("=== Swap and Reverse Elements Demo ===");
        System.out.println("Original Array: " + Arrays.toString(arr));

        // 1. Swap elements at index 1 and index 4
        swap(arr, 1, 4);
        System.out.println("After Swapping index 1 and 4: " + Arrays.toString(arr));

        // 2. Reverse the entire array using two-pointer swapping
        reverse(arr);
        System.out.println("After Reversing Array: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
