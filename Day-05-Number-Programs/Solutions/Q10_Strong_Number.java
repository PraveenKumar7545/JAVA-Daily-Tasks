import java.util.Scanner;

public class Q10_Strong_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;
            number = number / 10;
        }

        if (sum == original && original > 0) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

        scan.close();
    }
}