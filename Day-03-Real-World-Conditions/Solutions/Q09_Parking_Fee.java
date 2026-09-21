import java.util.Scanner;

public class Q09_Parking_Fee {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = scan.nextInt();

        int fee;

        if (hours <= 0) {
            System.out.println("Invalid Parking Hours");
            scan.close();
            return;
        }

        if (hours <= 2) {
            fee = hours * 30;
        } else if (hours <= 5) {
            fee = (2 * 30) + ((hours - 2) * 20);
        } else {
            fee = (2 * 30) + (3 * 20) + ((hours - 5) * 10);
        }

        System.out.println("Total Parking Fee: Rs." + fee);

        scan.close();
    }
}