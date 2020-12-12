import java.util.ArrayList;
import java.util.Scanner;

public class Animals {
    private String name;
    private String color;
    private int paws;
    private boolean isDomestic;
    private ArrayList<String> favoriteFood = new ArrayList<>();


    public Animals(String name, String color, int paws, boolean isDomestic) {
        this.name = name;
        this.color = color;
        this.paws = paws;
        this.isDomestic = isDomestic;
        setFavoriteFood();
        print();
    }



    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public void setFavoriteFood(ArrayList<String> favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteFood() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum amount of food for this animal: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++)
        {
            System.out.print(i + " Food: ");
            favoriteFood.add(sc.nextLine());
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public void getFavoriteFood() {
        for (String s : favoriteFood) {
            System.out.println(s);
        }
    }

    public int getPaws() {
        return paws;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    public boolean getDomestic() {
        return isDomestic;
    }

    public void print()
    {
        System.out.println("Name: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Is Domestic?: " + getDomestic());
        System.out.println("Number of paws: " + getPaws());
        getFavoriteFood();
    }
}
