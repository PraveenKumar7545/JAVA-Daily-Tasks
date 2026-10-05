import java.util.ArrayList;
import java.util.Scanner;

public class Q02_ArrayList_User_Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            numbers.add(number);
            sum += number;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);

        scan.close();
    }
}