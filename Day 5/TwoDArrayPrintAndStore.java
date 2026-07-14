public class TwoDArrayPrintAndStore {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        // 1. Storing data into 2-D array
        int value = 10;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = value;
                value += 10;
            }
        }

        // 2. Printing 2-D array
        System.out.println("=== 2-D Array Storing and Printing Demo ===");
        for (int r = 0; r < rows; r++) {
            System.out.print("Row " + r + ": ");
            for (int c = 0; c < cols; c++) {
                System.out.printf("%4d ", matrix[r][c]);
            }
            System.out.println();
        }
    }
}
