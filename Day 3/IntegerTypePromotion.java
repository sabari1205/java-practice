public class IntegerTypePromotion {
    public static void main(String[] args) {
        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;

        // In Java, bytes and shorts are automatically promoted to int when evaluating arithmetic expressions.
        // Thus, (b1 * b2) exceeds byte range (-128 to 127) but works without overflow because it's promoted to int.
        int result = (b1 * b2) / b3;

        System.out.println("=== Expression Integer Type Promotion Demo ===");
        System.out.println("b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3);
        System.out.println("Expression: (b1 * b2) / b3");
        System.out.println("Result (as int): " + result);

        short s1 = 1000;
        short s2 = 2000;
        // The following line would cause a compile error if not casted: short s3 = s1 + s2;
        int promotedSum = s1 + s2;
        System.out.println("Promoted short sum (short + short -> int): " + promotedSum);
    }
}
