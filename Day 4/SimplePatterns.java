public class SimplePatterns {
    public static void main(String[] args) {
        System.out.println("=== 1. Square Pattern ===");
        printSquare(4);
        
        System.out.println("\n=== 2. Rectangle Pattern ===");
        printRectangle(3, 6);
        
        System.out.println("\n=== 3. Right-Angled Triangle Pattern ===");
        printTriangle(5);
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
