package part8.task35;

public class Master extends Staff {
    public Master(){
        super();
    }

    int percent;

    public double calcSalary() {

        return wage * percent;
    }

    public String getPosition() {

        return "Мастер";
    }
}