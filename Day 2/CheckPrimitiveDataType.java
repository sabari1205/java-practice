public class CheckPrimitiveDataType {
    public static void main(String[] args) {
        int iVal = 100;
        double dVal = 99.99;
        char cVal = 'J';
        boolean bVal = true;
        
        System.out.println("=== Checking Data Types using Object Wrapper Class ===");
        System.out.println("Value: " + iVal + ", Type: " + ((Object) iVal).getClass().getSimpleName());
        System.out.println("Value: " + dVal + ", Type: " + ((Object) dVal).getClass().getSimpleName());
        System.out.println("Value: " + cVal + ", Type: " + ((Object) cVal).getClass().getSimpleName());
        System.out.println("Value: " + bVal + ", Type: " + ((Object) bVal).getClass().getSimpleName());
    }
}
