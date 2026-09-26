import java.util.Scanner;

public class Q09_Prime_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int limit = scan.nextInt();

        System.out.println("Prime Numbers:");

        for (int number = 2; number <= limit; number++) {

            boolean prime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(number + " ");
            }
        }

        scan.close();
    }
}