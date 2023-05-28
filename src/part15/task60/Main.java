package part15.task60;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        for (int i = 0; i < 10; i++) {
            completionService.submit(new SumGenerator());
        }
        for (int i = 0; i < 10; i++) {
            Future<String> future = completionService.take();
            String sum = future.get();
            System.out.println("Sum of generated numbers: " + sum);
        }
        executor.shutdown();
    }
}
