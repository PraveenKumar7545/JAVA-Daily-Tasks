abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Q06_Abstract_Class {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.draw();
    }
}