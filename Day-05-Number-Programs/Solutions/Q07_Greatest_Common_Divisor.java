import java.util.Scanner;

public class Q07_Greatest_Common_Divisor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        int a = Math.abs(number1);
        int b = Math.abs(number2);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD: " + a);

        scan.close();
    }
}