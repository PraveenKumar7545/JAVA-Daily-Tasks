import java.util.Scanner;
public class Q09_Discount_Calculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage. It should be between 0 and 100.");
        } else {
            double discountAmount = (discountPercentage / 100) * originalPrice;
            double finalPrice = originalPrice - discountAmount;
            System.out.printf("The final price after a %.2f%% discount is: %.2f%n", discountPercentage, finalPrice);
        }

        scanner.close();
    }
}