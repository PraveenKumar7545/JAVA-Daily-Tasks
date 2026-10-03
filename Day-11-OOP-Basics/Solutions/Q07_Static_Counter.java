class Student {

    static int studentCount = 0;

    Student() {
        studentCount++;
    }
}

public class Q07_Static_Counter {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.println("Total Students: " + Student.studentCount);
    }
}