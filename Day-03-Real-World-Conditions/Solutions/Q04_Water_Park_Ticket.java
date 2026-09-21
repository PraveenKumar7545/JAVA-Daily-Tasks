import java.util.Scanner;

public class Q04_Water_Park_Ticket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 5) {
            System.out.println("Ticket Price: Free");
        } else if (age <= 12) {
            System.out.println("Ticket Price: Rs.100");
        } else if (age < 60) {
            System.out.println("Ticket Price: Rs.250");
        } else {
            System.out.println("Ticket Price: Rs.150");
        }

        scan.close();
    }
}