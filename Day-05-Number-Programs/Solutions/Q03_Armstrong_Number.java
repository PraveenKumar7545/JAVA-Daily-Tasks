import java.util.Scanner;

public class Q03_Armstrong_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int original = number;
        int temp = number;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        scan.close();
    }
}