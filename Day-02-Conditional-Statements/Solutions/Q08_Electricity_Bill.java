import java.util.Scanner;
public class Q08_Electricity_Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double billAmount;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 200) {
            billAmount = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 300) {
            billAmount = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        } else {
            billAmount = 100 * 1.5 + 100 * 2.5 + 100 * 3.5 + (units - 300) * 4.5;
        }

        System.out.printf("The electricity bill for %d units is: %.2f%n", units, billAmount);
        scanner.close();
    }
}
