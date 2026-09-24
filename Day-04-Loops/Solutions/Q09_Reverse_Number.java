import java.util.Scanner;

public class Q09_Reverse_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int temp = Math.abs(number);
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (number < 0) {
            reverse = -reverse;
        }

        System.out.println("Reverse: " + reverse);

        scan.close();
    }
}