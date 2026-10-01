import java.util.Arrays;
import java.util.Scanner;

public class Q07_Check_Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replace(" ", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}