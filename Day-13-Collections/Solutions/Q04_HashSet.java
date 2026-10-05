import java.util.HashSet;

public class Q04_HashSet {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);

        System.out.println("HashSet: " + numbers);
    }
}