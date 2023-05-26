package part13.task54;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                ArrayGenerator generator = new ArrayGenerator(10);
                int max = generator.getMax();
                System.out.println(Thread.currentThread()
                        .getName()
                        + " Максимальный элемент: "
                        + max);
            })
                    .start();
        }
    }
}