import java.util.Scanner;

public class Q06_Movie_Ticket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.print("Enter show type (Normal/IMAX): ");
        String showType = scan.nextLine();

        double ticketPrice;

        if (age < 0) {
            System.out.println("Invalid Age");
            scan.close();
            return;
        } else if (age < 12) {
            ticketPrice = 120;
        } else if (age < 60) {
            ticketPrice = 200;
        } else {
            ticketPrice = 150;
        }

        if (showType.equalsIgnoreCase("IMAX")) {
            ticketPrice += 100;
        }

        System.out.println("Final Ticket Price: Rs." + ticketPrice);

        scan.close();
    }
}