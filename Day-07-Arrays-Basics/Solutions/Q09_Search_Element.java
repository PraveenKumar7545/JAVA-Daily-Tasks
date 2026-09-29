import java.util.Scanner;

public class Q09_Search_Element {
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

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == search) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        scan.close();
    }
}