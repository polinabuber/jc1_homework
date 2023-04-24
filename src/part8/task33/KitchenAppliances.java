package part8.task33;

public class KitchenAppliances extends Appliances{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String isCondition() {
        return name+super.isCondition();
    }

    public KitchenAppliances(String brand, String name) {
        super(brand);
        this.name = name;
    }
}
