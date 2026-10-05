import java.util.LinkedList;

public class Q03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original Fruits: " + fruits);

        fruits.remove("Orange");

        System.out.println("After Removing Orange: " + fruits);
    }
}