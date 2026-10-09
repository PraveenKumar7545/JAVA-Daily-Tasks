public class Q03_Null_Pointer_Exception {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String value is null.");
        }
    }
}