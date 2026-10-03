class Person {

    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String name) {
        this.name = name;
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Q08_Constructor_Overloading {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Arun");
        Person person3 = new Person("Kumar", 21);

        System.out.println("Person 1");
        person1.display();

        System.out.println("Person 2");
        person2.display();

        System.out.println("Person 3");
        person3.display();
    }
}