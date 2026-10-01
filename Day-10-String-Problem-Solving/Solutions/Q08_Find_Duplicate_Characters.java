import java.util.Scanner;

public class Q08_Find_Duplicate_Characters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        boolean found = false;

        System.out.print("Duplicate characters: ");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ' || str.indexOf(ch) != i) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(ch + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("None");
        }

        sc.close();
    }
}