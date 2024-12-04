import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numerator (integer): ");
            int numerator = scanner.nextInt();

            System.out.print("Enter a denominator (integer): ");
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);

            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        return numerator / denominator;
    }
}
