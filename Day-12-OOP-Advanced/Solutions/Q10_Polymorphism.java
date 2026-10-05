class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog says: Bow Bow");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class Q10_Polymorphism {

    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}