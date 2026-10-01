import java.util.Scanner;

public class Q10_Remove_Spaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replace(" ", "");

        System.out.println("String without spaces: " + result);

        sc.close();
    }
}