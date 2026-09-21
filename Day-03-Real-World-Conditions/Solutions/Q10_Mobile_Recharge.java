import java.util.Scanner;

public class Q10_Mobile_Recharge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter recharge amount: ");
        double amount = scan.nextDouble();

        if (amount >= 599) {
            System.out.println("Plan: Unlimited Data + Calls");
        } else if (amount >= 399) {
            System.out.println("Plan: 2GB Data per Day + Calls");
        } else if (amount >= 199) {
            System.out.println("Plan: 1GB Data per Day + Calls");
        } else if (amount > 0) {
            System.out.println("Plan: Basic Plan");
        } else {
            System.out.println("Invalid Recharge Amount");
        }

        scan.close();
    }
}