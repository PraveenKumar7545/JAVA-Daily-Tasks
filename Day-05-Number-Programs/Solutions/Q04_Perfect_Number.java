import java.util.Scanner;

public class Q04_Perfect_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int sum = 0;

        if (number > 1) {
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
        }

        if (sum == number && number > 0) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        scan.close();
    }
}