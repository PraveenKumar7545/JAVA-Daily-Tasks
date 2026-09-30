import java.util.Scanner;

public class Q04_Second_Largest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest Element Not Found");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        scan.close();
    }
}