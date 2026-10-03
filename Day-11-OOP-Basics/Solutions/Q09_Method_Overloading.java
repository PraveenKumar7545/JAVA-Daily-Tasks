class Calculator {

    int add(int number1, int number2) {
        return number1 + number2;
    }

    int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    double add(double number1, double number2) {
        return number1 + number2;
    }
}

public class Q09_Method_Overloading {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Two Integers: " +
                calculator.add(10, 20));

        System.out.println("Three Integers: " +
                calculator.add(10, 20, 30));

        System.out.println("Two Decimal Numbers: " +
                calculator.add(10.5, 20.5));
    }
}