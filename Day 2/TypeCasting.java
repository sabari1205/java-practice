public class TypeCasting {
    public static void main(String[] args) {
        int num = 65;
        double d = num;
        System.out.println("int to double: " + d);

        double price = 99.99;
        int rounded = (int) price;
        System.out.println("double to int: " + rounded);

        char ch = (char) num;
        System.out.println("int to char: " + ch);

        float f = 10.5f;
        int x = (int) f;
        System.out.println("float to int: " + x);
    }
}
