import java.util.Scanner;

public class Q07_Merge_Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int size1 = scan.nextInt();

        int[] array1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter first array element " + (i + 1) + ": ");
            array1[i] = scan.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int size2 = scan.nextInt();

        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter second array element " + (i + 1) + ": ");
            array2[i] = scan.nextInt();
        }

        int[] merged = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            merged[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = array2[i];
        }

        System.out.println("Merged Array:");

        for (int number : merged) {
            System.out.print(number + " ");
        }

        scan.close();
    }
}