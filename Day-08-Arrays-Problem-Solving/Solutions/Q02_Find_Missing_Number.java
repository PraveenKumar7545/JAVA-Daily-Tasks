import java.util.Scanner;

public class Q02_Find_Missing_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scan.nextInt();

        int[] numbers = new int[n - 1];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing Number: " + missing);

        scan.close();
    }
}