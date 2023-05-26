package part13.task53;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new AverageCalculator()).start();
        }
    }
}
