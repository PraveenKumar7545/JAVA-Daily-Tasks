class Rectangle {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Q04_Rectangle_Class {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Rectangle Details");
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}