package part8.task33;

public class Main {
    public static void main(String[] args) {
        ElectricKettle electricKettle = new ElectricKettle("Redmond", "Kettle", "transparent", 80.50);
        System.out.println(electricKettle.isCondition());
        electricKettle.setCondition(true);
        System.out.println(electricKettle.isCondition());
        electricKettle.makeTea();
        Microwave microWave = new Microwave("LG", "MicroWave", 6.2, 423.45);
        microWave.makeFood();
        microWave.setCondition(true);
        microWave.makeFood();
    }
}
