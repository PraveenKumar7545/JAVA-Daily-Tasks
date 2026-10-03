class Car {

    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs." + price);
        System.out.println();
    }
}

public class Q06_Car_Objects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Fortuner", 4000000);
        Car car2 = new Car("Hyundai", "Creta", 1800000);

        System.out.println("Car 1");
        car1.display();

        System.out.println("Car 2");
        car2.display();
    }
}