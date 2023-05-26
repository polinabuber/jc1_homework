package part13.task55;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class ArraysInFiles implements Runnable {
    private final String fileName;

    public ArraysInFiles(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        StringBuilder sb = new StringBuilder();
        for (int number : array) {
            sb.append(number).append(" ");
        }
        try {
            Files.write(Paths.get(fileName), sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
