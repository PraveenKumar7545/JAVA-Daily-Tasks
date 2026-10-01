import java.util.Scanner;

public class Q04_Convert_To_Lowercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Lowercase: " + str.toLowerCase());

        sc.close();
    }
}