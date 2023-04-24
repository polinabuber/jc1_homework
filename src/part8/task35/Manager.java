package part8.task35;


public class Manager extends Staff {

    public Manager() {
        super();
    }

    long workHours;



    public double calcSalary() {

        return wage * workHours;
    }

    public String getPosition() {
        return "Менеджер";
    }

}
