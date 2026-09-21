import java.util.Scanner;

public class Q05_Simple_Interest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scan.nextDouble();

        System.out.print("Enter time in years: ");
        double time = scan.nextDouble();

        System.out.print("Enter customer type (1-Student, 2-General): ");
        int type = scan.nextInt();

        double rate;

        if (type == 1) {
            rate = 5;
        } else if (type == 2) {
            rate = 7;
        } else {
            System.out.println("Invalid Customer Type");
            scan.close();
            return;
        }

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Simple Interest: Rs." + simpleInterest);
        System.out.println("Total Amount: Rs." + totalAmount);

        scan.close();
    }
}