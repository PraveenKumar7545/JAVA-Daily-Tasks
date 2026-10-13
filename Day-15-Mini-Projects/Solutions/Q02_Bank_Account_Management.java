import java.util.Scanner;

public class Q02_Bank_Account_Management {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 1000.00;

        while (true) {
            System.out.println("\n--- Bank Account ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: Rs. %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scan.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Enter a valid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scan.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Enter a valid amount.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you.");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}