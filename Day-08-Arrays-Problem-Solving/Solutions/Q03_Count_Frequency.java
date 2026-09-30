import java.util.Scanner;

public class Q03_Count_Frequency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.print("Enter element to search: ");
        int search = scan.nextInt();

        int count = 0;

        for (int number : numbers) {
            if (number == search) {
                count++;
            }
        }

        System.out.println("Frequency: " + count);

        scan.close();
    }
}