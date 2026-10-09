public class Q05_Multiple_Catch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            int result = 10 / 0;
            System.out.println(result);
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic operation failed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        try {
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
    }
}