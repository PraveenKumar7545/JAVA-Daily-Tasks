class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs." + salary);
    }
}

public class Q02_Employee_Constructor {
    public static void main(String[] args) {

        Employee employee = new Employee("Arun", 30000);

        employee.display();
    }
}