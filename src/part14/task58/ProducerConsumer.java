package part14.task58;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private static final int QUEUE_SIZE = 200;
    private static final int SLEEP_THRESHOLD = 100;
    private static final int WAKEUP_THRESHOLD = 80;
    private static final int TOTAL_ITEMS = 10000;

    private final Queue<Integer> queue = new LinkedList<>();
    private final Object lock = new Object();
    private int itemsProcessed = 0;

    public void start() {
        Thread p1 = new Thread(new Producer(queue, lock, this));
        Thread p2 = new Thread(new Producer(queue, lock, this));
        Thread p3 = new Thread(new Producer(queue, lock, this));
        Thread c1 = new Thread(new Consumer(queue, lock, this));
        Thread c2 = new Thread(new Consumer(queue, lock, this));

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();

        try {
            p1.join();
            p2.join();
            p3.join();
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void incrementItemsProcessed() {
        itemsProcessed++;
    }

    public boolean isDone() {
        return itemsProcessed >= TOTAL_ITEMS;
    }

    public int getSleepThreshold() {
        return SLEEP_THRESHOLD;
    }

    public int getWakeupThreshold() {
        return WAKEUP_THRESHOLD;
    }
}