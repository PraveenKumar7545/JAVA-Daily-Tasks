import java.util.Scanner;

public class Q07_Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not possible for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial: " + factorial);
        }

        scan.close();
    }
}