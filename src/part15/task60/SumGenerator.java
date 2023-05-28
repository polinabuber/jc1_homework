package part15.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class SumGenerator implements Callable<String> {

    private static final int NUM_NUMBERS = 10;

    @Override
    public String call() throws Exception {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < NUM_NUMBERS; i++) {
            int number = rand.nextInt(100);
            numbers.add(number);
            sum += number;
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " generated numbers " + numbers);
        TimeUnit.SECONDS.sleep(rand.nextInt(10) + 1);
        return String.valueOf(sum);
    }
}
