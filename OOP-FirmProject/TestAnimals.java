package oop;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("Unknown");
        Dog d = new Dog("Buddy");
        Cat c = new Cat("Luna");

        a.speak();
        d.speak();
        c.speak();
    }
}
