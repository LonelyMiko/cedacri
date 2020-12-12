import java.util.ArrayList;

public class Dog extends Animals implements IAnimals{

    public Dog(String name, String color, int paws, boolean isDomestic) {
        super(name, color, paws, isDomestic);
    }

    @Override
    public void sound() {
        System.out.println("Brak - Brak");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
