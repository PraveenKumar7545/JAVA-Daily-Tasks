import java.util.Scanner;

public class Q08_Least_Common_Multiple {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();

        int a = Math.abs(number1);
        int b = Math.abs(number2);

        int x = a;
        int y = b;

        while (y != 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }

        int gcd = x;

        if (gcd == 0) {
            System.out.println("LCM: 0");
        } else {
            int lcm = (a / gcd) * b;
            System.out.println("LCM: " + lcm);
        }

        scan.close();
    }
}