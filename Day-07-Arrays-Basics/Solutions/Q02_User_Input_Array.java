import java.util.Scanner;

public class Q02_User_Input_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        scan.close();
    }
}