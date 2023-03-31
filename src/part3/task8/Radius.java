package part3.task8;

public class Radius {
    public static void main(String[] args) {

        int r = 10;
        int a = 5;
        int b = 10;

        if (2 * r >= Math.sqrt(a * a + b * b)) {
            System.out.println("Покрывает");
        } else {
            System.out.println("Не покрывает");
        }

    }
}