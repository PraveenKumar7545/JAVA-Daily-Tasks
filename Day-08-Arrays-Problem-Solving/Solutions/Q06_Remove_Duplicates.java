import java.util.Scanner;

public class Q06_Remove_Duplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("Array After Removing Duplicates:");

        for (int i = 0; i < size; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }

        scan.close();
    }
}