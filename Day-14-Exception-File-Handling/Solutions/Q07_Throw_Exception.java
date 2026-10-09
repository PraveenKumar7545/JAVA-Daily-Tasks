import java.util.Scanner;

public class Q07_Throw_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException(
                    "Age must be 18 or above."
                );
            }

            System.out.println("You are eligible.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}