package part8.task35;

public abstract class Staff {
    String position;
    double wage;

    abstract double calcSalary();
    abstract String getPosition();


    public static void main(String[] args) {
        Manager myManager = new Manager();
        System.out.println("Это " + myManager.getPosition() + " и его зарплата зависит от отработанных часов. Зарплата "  + myManager.calcSalary());

        Master myMaster = new Master();
        System.out.println("Это " + myMaster.getPosition() + " и его зарплата зависит от проделанной работы. Зарплата " + myMaster.calcSalary());

        Worker myWorker = new Worker();
        System.out.println("Это " + myWorker.getPosition() + " а его зарплата зависит от отработанного времени и от проделанной работы. Зарплата " + myWorker.calcSalary());
    }
}