import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id
                + " | Name: " + name
                + " | Marks: " + marks);
    }
}

public class Q01_Student_Management_System {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scan.nextInt();
                scan.nextLine();

                boolean exists = false;
                for (Student student : students) {
                    if (student.id == id) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("Student ID already exists.");
                    continue;
                }

                System.out.print("Enter name: ");
                String name = scan.nextLine();

                System.out.print("Enter marks: ");
                double marks = scan.nextDouble();

                students.add(new Student(id, name, marks));
                System.out.println("Student added successfully.");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students available.");
                } else {
                    for (Student student : students) {
                        student.display();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter student ID: ");
                int id = scan.nextInt();
                boolean found = false;

                for (Student student : students) {
                    if (student.id == id) {
                        student.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting Student Management.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        scan.close();
    }
}