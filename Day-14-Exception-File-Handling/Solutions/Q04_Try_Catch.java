import java.util.Scanner;

public class Q04_Try_Catch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int first = scan.nextInt();

            System.out.print("Enter second number: ");
            int second = scan.nextInt();

            int result = first / second;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter integers only.");
        } finally {
            scan.close();
            System.out.println("Program completed.");
        }
    }
}