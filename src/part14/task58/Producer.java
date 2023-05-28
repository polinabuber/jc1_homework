package part14.task58;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    private final Queue<Integer> queue;
    private final Object lock;
    private final ProducerConsumer pc;

    public Producer(Queue<Integer> queue, Object lock, ProducerConsumer pc) {
        this.queue = queue;
        this.lock = lock;
        this.pc = pc;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (lock) {
                while (queue.size() >= pc.getSleepThreshold()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int item = random.nextInt(100) + 1;
                queue.add(item);
                System.out.println(Thread.currentThread().getName() + " produced: " + item);
                lock.notifyAll();

                if (pc.isDone()) {
                    break;
                }
            }
        }
    }
}
