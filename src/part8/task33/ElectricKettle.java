package part8.task33;

public class ElectricKettle extends KitchenAppliances{
    private String color;
    private double price;

    public ElectricKettle(String brand, String name, String color, double price) {
        super(brand, name);
        this.color = color;
        this.price = price;
    }

    public void makeTea(){
        if (condition())
            System.out.println("Чайник работает");
        else
            System.out.println("Включите чайник");
    }
}
