import java.util.Scanner;

public class Q06_Factors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            System.out.println("Factors:");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        scan.close();
    }
}