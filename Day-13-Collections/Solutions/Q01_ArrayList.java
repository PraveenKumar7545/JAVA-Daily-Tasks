import java.util.ArrayList;

public class Q01_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Praveen");
        names.add("Arun");
        names.add("Karthik");
        names.add("Rahul");
        names.add("Vijay");

        System.out.println("Names in ArrayList:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}