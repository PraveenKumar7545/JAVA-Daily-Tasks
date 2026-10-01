import java.util.Scanner;

public class Q06_Remove_Vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' &&
                ch != 'O' && ch != 'U') {

                result = result + ch;
            }
        }

        System.out.println("String without vowels: " + result);

        sc.close();
    }
}