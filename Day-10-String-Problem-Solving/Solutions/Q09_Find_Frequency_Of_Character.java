import java.util.Scanner;

public class Q09_Find_Frequency_Of_Character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char target = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);

        sc.close();
    }
}