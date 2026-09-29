import java.util.Scanner;

public class Q03_Sum_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();

            sum = sum + numbers[i];
        }

        System.out.println("Sum of Array: " + sum);

        scan.close();
    }
}