import java.util.Scanner;

public class Q10_Common_Elements {
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

        System.out.println("Common Elements:");

        boolean found = false;

        for (int i = 0; i < size1; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (array1[i] == array1[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No Common Elements");
        }

        scan.close();
    }
}