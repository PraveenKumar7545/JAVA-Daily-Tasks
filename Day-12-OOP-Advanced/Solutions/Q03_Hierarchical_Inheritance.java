class Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is riding");
    }
}

public class Q03_Hierarchical_Inheritance {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.drive();

        System.out.println();

        Bike bike = new Bike();

        bike.start();
        bike.ride();
    }
}