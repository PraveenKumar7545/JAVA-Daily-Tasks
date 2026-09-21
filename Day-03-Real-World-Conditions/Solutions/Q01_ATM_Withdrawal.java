import java.util.Scanner;

public class Q01_ATM_Withdrawal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = scan.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scan.nextDouble();

        if (withdrawal <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (withdrawal > balance) {
            System.out.println("Insufficient Balance");
        } else if (balance - withdrawal < 500) {
            System.out.println("Minimum balance of Rs.500 required");
        } else {
            balance = balance - withdrawal;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: Rs." + balance);
        }

        scan.close();
    }
}