public class AsciiValue {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch;
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);

        int num = 97;
        char letter = (char) num;
        System.out.println("ASCII " + num + " = " + letter);
    }
}
