package part16.task62;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        double sum = IntStream.rangeClosed(1, 20)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i + " дюймов"))
                .mapToDouble(i -> i * 2.54)
                .sum();
        System.out.println("Сумма в сантиметрах: " + sum);
    }
}
