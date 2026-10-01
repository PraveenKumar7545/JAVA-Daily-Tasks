import java.util.Scanner;

public class Q02_Count_Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}