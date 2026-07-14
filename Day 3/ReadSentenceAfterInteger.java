import java.util.Scanner;

public class ReadSentenceAfterInteger {
    public static void main(String[] args) {
        // Demonstrating how to correctly read a String sentence after reading an integer
        // To avoid hangs during automated execution, we use a string source for Scanner
        String simulatedInput = "25\nWelcome to Java Programming Bootcamp!\n";
        Scanner scanner = new Scanner(simulatedInput);

        System.out.println("=== Reading a Sentence after an Integer ===");
        
        System.out.print("Reading Age (integer): ");
        int age = scanner.nextInt();
        
        // Consume the leftover newline character
        scanner.nextLine();
        
        System.out.print("Reading Welcome Sentence (String): ");
        String sentence = scanner.nextLine();
        
        System.out.println("\n--- Output ---");
        System.out.println("Age: " + age);
        System.out.println("Sentence: " + sentence);
        
        scanner.close();
    }
}
