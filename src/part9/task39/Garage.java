package part9.task39;


import java.util.Scanner;

public class Garage<T extends Vehicle> {

    private String name;
    private String colour;

    public String getName()
    {
        return name;

    }

    private String getColour() {
        return colour;
    }

    public Garage() {
        enterData();
    }

    public void enterData() {
        System.out.println("Введите бренд транспортного средства");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Введите цвет");
        colour = scanner.nextLine();


    }
}