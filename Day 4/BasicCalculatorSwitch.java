public class BasicCalculatorSwitch {
    public static void main(String[] args) {
        double num1 = 100.0;
        double num2 = 25.0;
        char[] operators = {'+', '-', '*', '/', '%'};

        System.out.println("=== Basic Calculator Using Switch Case ===");
        for (char op : operators) {
            System.out.printf("%.1f %c %.1f = ", num1, op, num2);
            switch (op) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    if (num2 != 0) System.out.println(num1 / num2);
                    else System.out.println("Cannot divide by zero");
                    break;
                case '%':
                    if (num2 != 0) System.out.println(num1 % num2);
                    else System.out.println("Cannot divide by zero");
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        }
    }
}
