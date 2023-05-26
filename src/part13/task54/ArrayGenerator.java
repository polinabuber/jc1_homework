package part13.task54;

import java.util.Random;
import java.util.Arrays;

public class ArrayGenerator {
    private final int[] array;

    public ArrayGenerator(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public int getMax() {
        return Arrays.stream(array)
                .max()
                .orElse(Integer.MIN_VALUE);
    }
}