import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q08_Custom_Exception {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above."
            );
        }

        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            scan.close();
        }
    }
}