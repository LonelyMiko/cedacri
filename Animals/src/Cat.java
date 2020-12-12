import java.util.ArrayList;

public class Cat extends Animals implements IAnimals {
    public Cat(String name, String color, int paws, boolean isDomestic) {
        super(name, color, paws, isDomestic);
    }

    @Override
    public void sound() {
        System.out.println("Meow - Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
