import java.util.Scanner;

public class Q09_Move_Zeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int index = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        while (index < size) {
            numbers[index] = 0;
            index++;
        }

        System.out.println("Array After Moving Zeros:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scan.close();
    }
}