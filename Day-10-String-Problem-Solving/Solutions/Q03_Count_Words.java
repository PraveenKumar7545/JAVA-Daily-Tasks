import java.util.Scanner;

public class Q03_Count_Words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }

        sc.close();
    }
}