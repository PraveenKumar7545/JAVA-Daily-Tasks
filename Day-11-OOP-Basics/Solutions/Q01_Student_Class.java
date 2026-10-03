class Student {
    String name;
    int age;
    double mark;
}

public class Q01_Student_Class {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Praveen";
        student.age = 21;
        student.mark = 85;

        System.out.println("Student Details");
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Mark: " + student.mark);
    }
}