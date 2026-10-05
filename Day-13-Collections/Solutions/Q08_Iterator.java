import java.util.ArrayList;
import java.util.Iterator;

public class Q08_Iterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Praveen");
        names.add("Arun");
        names.add("Karthik");
        names.add("Rahul");
        names.add("Vijay");

        Iterator<String> iterator = names.iterator();

        System.out.println("Names using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}