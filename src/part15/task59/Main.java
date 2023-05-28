package part15.task59;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<List<String>> future = executor.submit(new FileGenerator());
            futures.add(future);
        }
        for (Future<List<String>> future : futures) {
            List<String> fileNames = future.get();
            System.out.println("Generated files: " + fileNames);
        }
        executor.shutdown();
    }
}
