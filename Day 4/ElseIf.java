public class ElseIf {
    public static void main(String[] args) {
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 60) {
            System.out.println("Good");
        } else if (marks >= 40) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}
