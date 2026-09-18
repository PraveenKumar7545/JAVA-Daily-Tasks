import java.util.Scanner;

public class Q04_User_Input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        System.out.print("Enter your mark : ");
        double mark = scan.nextDouble();

        System.out.println();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Mark : " + mark);

        scan.close();
    }
}