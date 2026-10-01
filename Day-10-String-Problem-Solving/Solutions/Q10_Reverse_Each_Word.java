import java.util.Scanner;

public class Q10_Reverse_Each_Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.print("Reversed words: ");

        for (String word : words) {

            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }

            System.out.print(reverse + " ");
        }

        sc.close();
    }
}