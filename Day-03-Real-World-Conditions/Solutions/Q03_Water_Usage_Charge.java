import java.util.Scanner;

public class Q03_Water_Usage_Charge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter water units: ");
        double units = scan.nextDouble();

        double bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = units * 7;
        } else {
            bill = units * 10;
        }

        System.out.println("Water Usage: " + units + " units");
        System.out.println("Total Water Bill: Rs." + bill);

        scan.close();
    }
}