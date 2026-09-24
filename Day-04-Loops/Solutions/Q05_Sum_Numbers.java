import java.util.Scanner;

public class Q05_Sum_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);

        scan.close();
    }
}