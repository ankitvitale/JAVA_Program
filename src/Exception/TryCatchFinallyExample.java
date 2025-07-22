package Exception;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes (cleanup code).");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
