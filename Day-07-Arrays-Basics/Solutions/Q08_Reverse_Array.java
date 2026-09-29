import java.util.Scanner;

public class Q08_Reverse_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("Reverse Array:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scan.close();
    }
}