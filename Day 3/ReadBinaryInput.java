import java.util.Scanner;

public class ReadBinaryInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Read Binary Input Demo ===");
        // For demonstration without hanging on stdin if run non-interactively, we can test with a fixed binary string or check if input is available
        String binaryString = "101101";
        System.out.println("Simulated binary input: " + binaryString);
        
        try {
            int decimalValue = Integer.parseInt(binaryString, 2);
            System.out.println("Binary " + binaryString + " in Decimal is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number format.");
        }
        
        scanner.close();
    }
}
