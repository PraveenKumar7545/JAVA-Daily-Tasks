import java.util.Scanner;

public class Q01_Find_Duplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        System.out.println("Duplicate Elements:");

        boolean found = false;

        for (int i = 0; i < size; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No Duplicate Elements");
        }

        scan.close();
    }
}