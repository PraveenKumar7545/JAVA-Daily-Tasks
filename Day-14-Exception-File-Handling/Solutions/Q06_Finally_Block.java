public class Q06_Finally_Block {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred.");
        } finally {
            System.out.println("Finally block always executes here.");
        }
    }
}