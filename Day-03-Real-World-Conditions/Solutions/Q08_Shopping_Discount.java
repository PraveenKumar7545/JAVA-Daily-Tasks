import java.util.Scanner;

public class Q08_Shopping_Discount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter shopping amount: ");
        double amount = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter membership type (Premium/Regular/Non-Member): ");
        String membership = scan.nextLine();

        double discountPercentage = 0;

        if (membership.equalsIgnoreCase("Premium")) {

            if (amount >= 5000) {
                discountPercentage = 25;
            } else {
                discountPercentage = 20;
            }

        } else if (membership.equalsIgnoreCase("Regular")) {

            if (amount >= 5000) {
                discountPercentage = 15;
            } else {
                discountPercentage = 10;
            }

        } else if (membership.equalsIgnoreCase("Non-Member")) {

            if (amount >= 5000) {
                discountPercentage = 5;
            }

        } else {
            System.out.println("Invalid Membership Type");
            scan.close();
            return;
        }

        double discount = amount * discountPercentage / 100;
        double finalAmount = amount - discount;

        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + finalAmount);

        scan.close();
    }
}