import java.util.Scanner;

public class Q01_Print_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("String: " + str);

        sc.close();
    }
}