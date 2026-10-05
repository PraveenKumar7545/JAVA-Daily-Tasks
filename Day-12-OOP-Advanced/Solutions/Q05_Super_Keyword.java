class Vehicle {

    String brand = "Toyota";
}

class Car extends Vehicle {

    String model = "Fortuner";

    void display() {

        System.out.println("Brand: " + super.brand);
        System.out.println("Model: " + model);
    }
}

public class Q05_Super_Keyword {

    public static void main(String[] args) {

        Car car = new Car();

        car.display();
    }
}