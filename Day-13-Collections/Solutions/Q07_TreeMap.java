import java.util.TreeMap;

public class Q07_TreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(104, "Rahul");
        employees.put(101, "Praveen");
        employees.put(103, "Karthik");
        employees.put(105, "Vijay");
        employees.put(102, "Arun");

        System.out.println("Employees:");

        for (Integer id : employees.keySet()) {
            System.out.println(id + " : " + employees.get(id));
        }
    }
}