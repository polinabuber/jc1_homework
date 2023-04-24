package part8.task33;

public class Microwave extends KitchenAppliances{
    private double weight;
    private double price;

    public Microwave(String brand, String name, double weight, double price) {
        super(brand, name);
        this.weight = weight;
        this.price = price;
    }
    public void makeFood(){
        if (condition())
            System.out.println("Микроволновка работает");
        else
            System.out.println("Включите микроволновку");
    }
}