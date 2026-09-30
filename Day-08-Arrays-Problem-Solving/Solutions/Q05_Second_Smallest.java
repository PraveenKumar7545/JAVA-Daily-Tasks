import java.util.Scanner;

public class Q05_Second_Smallest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int smallest = numbers[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest Element Not Found");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }

        scan.close();
    }
}