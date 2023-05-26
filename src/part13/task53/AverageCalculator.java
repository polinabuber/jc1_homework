package part13.task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class AverageCalculator implements Runnable {
    private static final double DEFAULT_AVERAGE = 0.0;
    @Override
    public void run() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println( numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(DEFAULT_AVERAGE));
    }
}
