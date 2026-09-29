import java.util.Scanner;

public class Q10_Copy_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] original = new int[size];
        int[] copy = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            original[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            copy[i] = original[i];
        }

        System.out.println("Original Array:");

        for (int i = 0; i < size; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println();

        System.out.println("Copied Array:");

        for (int i = 0; i < size; i++) {
            System.out.print(copy[i] + " ");
        }

        scan.close();
    }
}