import java.util.Scanner;

public class Q05_Fibonacci_Series {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int number = scan.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= number; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        scan.close();
    }
}