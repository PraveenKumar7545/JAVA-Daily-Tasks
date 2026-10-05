abstract class Employee {

    abstract void calculateSalary();
}

class Developer extends Employee {

    @Override
    void calculateSalary() {

        double salary = 50000;

        System.out.println("Developer Salary: Rs." + salary);
    }
}

public class Q07_Abstract_Method {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.calculateSalary();
    }
}   