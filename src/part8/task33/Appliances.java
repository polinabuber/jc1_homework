package part8.task33;

public class Appliances {
    private String brand;
    private boolean condition = false;

    public Appliances(String brand) {
        this.brand = brand;
    }
    public boolean condition(){
        return condition;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String isCondition() {
        if (condition)
            return " on";
        else
            return " off";
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

}
