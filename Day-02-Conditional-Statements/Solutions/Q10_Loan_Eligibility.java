import java.util.Scanner;
public class Q10_Loan_Eligibility{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();
        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        if (age >= 21 && income >= 25000 && creditScore >= 700) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }

        scanner.close();
    }
}