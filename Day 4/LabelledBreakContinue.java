public class LabelledBreakContinue {
    public static void main(String[] args) {
        System.out.println("=== Labelled Break Example: Search in a 2D Matrix ===");
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int target = 50;
        boolean found = false;

        outerLoop:
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == target) {
                    System.out.println("Target " + target + " found at row " + r + ", col " + c);
                    found = true;
                    break outerLoop; // Breaks out of both loops!
                }
            }
        }
        if (!found) System.out.println("Target not found.");

        System.out.println("\n=== Labelled Continue Example: Skip Row if Contains Negative Number ===");
        int[][] data = {
            {5, 10, 15},
            {20, -5, 30}, // This row will be skipped after encountering -5
            {35, 40, 45}
        };

        rowLoop:
        for (int r = 0; r < data.length; r++) {
            System.out.print("Row " + r + ": ");
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] < 0) {
                    System.out.println(" [Negative found, skipping rest of row!]");
                    continue rowLoop; // Continues to the next row in rowLoop!
                }
                System.out.print(data[r][c] + " ");
            }
            System.out.println();
        }
    }
}
