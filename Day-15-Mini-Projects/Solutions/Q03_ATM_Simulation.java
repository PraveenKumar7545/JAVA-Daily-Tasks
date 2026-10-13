import java.util.Scanner;

public class Q03_ATM_Simulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 5000.00;

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current balance: Rs. %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scan.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scan.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= amount;
                        System.out.println("Please collect your cash.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}