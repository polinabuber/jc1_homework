package part15.task61;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.*;

public class FileWriterService {
    public void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");
            for (int i = 0; i < 10; i++) {
                executor.submit(new FileWriterTask(writer));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            try {
                if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class FileWriterTask implements Callable<Void> {

        private final FileWriter writer;

        public FileWriterTask(FileWriter writer) {
            this.writer = writer;
        }

        @Override
        public Void call() throws Exception {
            String message = "Hello World " + LocalDateTime.now();
            synchronized (writer) {
                writer.write(message + System.lineSeparator());
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " wrote message: " + message);
            return null;
        }
    }
}
