import java.util.Scanner;

public class Q05_Arithmetic_Operators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number : ");
        int number2 = scan.nextInt();

        System.out.println("Addition : " + (number1 + number2));
        System.out.println("Subtraction : " + (number1 - number2));
        System.out.println("Multiplication : " + (number1 * number2));
        System.out.println("Division : " + (number1 / number2));
        System.out.println("Modulus : " + (number1 % number2));

        scan.close();
    }
}