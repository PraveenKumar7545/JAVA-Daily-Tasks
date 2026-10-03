class Student {

    String name;
    double mark;

    Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println();
    }
}

public class Q10_Array_of_Objects {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Arun", 85);
        students[1] = new Student("Kumar", 90);
        students[2] = new Student("Ravi", 78);

        System.out.println("Student Details");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1));
            students[i].display();
        }
    }
}