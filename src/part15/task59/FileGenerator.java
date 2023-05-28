package part15.task59;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FileGenerator implements Callable<List<String>> {

    private static final int NUM_FILES = 10;
    private static final int NUM_LINES = 10;

    @Override
    public List<String> call() throws Exception {
        List<String> fileNames = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < NUM_FILES; i++) {
            String fileName = "file" + i + ".txt";
            fileNames.add(fileName);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (int j = 0; j < NUM_LINES; j++) {
                    writer.write("Random line " + rand.nextInt(100));
                    writer.newLine();
                }
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " generated file " + fileName);
            TimeUnit.SECONDS.sleep(rand.nextInt(3) + 1);
        }
        return fileNames;
    }
}
