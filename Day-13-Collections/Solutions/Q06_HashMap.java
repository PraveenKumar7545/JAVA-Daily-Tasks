import java.util.HashMap;

public class Q06_HashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Praveen", 85);
        students.put("Arun", 78);
        students.put("Karthik", 92);
        students.put("Rahul", 88);
        students.put("Vijay", 75);

        System.out.println("Student Marks:");

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }
    }
}