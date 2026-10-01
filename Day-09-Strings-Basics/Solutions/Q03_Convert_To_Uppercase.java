import java.util.Scanner;

public class Q03_Convert_To_Uppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase());

        sc.close();
    }
}