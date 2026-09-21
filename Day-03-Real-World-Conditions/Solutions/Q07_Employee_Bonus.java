import java.util.Scanner;

public class Q07_Employee_Bonus {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();

        System.out.print("Enter years of experience: ");
        int experience = scan.nextInt();

        double bonusPercentage;

        if (experience >= 10) {
            bonusPercentage = 20;
        } else if (experience >= 5) {
            bonusPercentage = 15;
        } else if (experience >= 2) {
            bonusPercentage = 10;
        } else {
            bonusPercentage = 5;
        }

        double bonus = salary * bonusPercentage / 100;
        double finalSalary = salary + bonus;

        System.out.println("Salary: Rs." + salary);
        System.out.println("Bonus: Rs." + bonus);
        System.out.println("Final Salary: Rs." + finalSalary);

        scan.close();
    }
}