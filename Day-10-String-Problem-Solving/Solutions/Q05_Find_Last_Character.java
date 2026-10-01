import java.util.Scanner;

public class Q05_Find_Last_Character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (!str.isEmpty()) {
            System.out.println("Last character: " + str.charAt(str.length() - 1));
        } else {
            System.out.println("String is empty.");
        }

        sc.close();
    }
}