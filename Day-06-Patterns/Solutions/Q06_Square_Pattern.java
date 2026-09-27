import java.util.Scanner;

public class Q06_Square_Pattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scan.close();
    }
}