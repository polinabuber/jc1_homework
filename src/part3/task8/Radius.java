package part3.task8;

public class Radius {
    public static void main(String[] args) {

        int r = 10;
        int a = 5;
        int b = 10;

        if (2 * r >= Math.sqrt(a * a + b * b)) {
            System.out.println("Диаметр окружности покрывает размер прямоугольного отверстия");
        } else {
            System.out.println("Диаметр окружности не покрывает размер прямоугольного отверстия");
        }

    }
}