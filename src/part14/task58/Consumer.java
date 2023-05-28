package part14.task58;

import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> queue;
    private final Object lock;
    private final ProducerConsumer pc;

    public Consumer(Queue<Integer> queue, Object lock, ProducerConsumer pc) {
        this.queue = queue;
        this.lock = lock;
        this.pc = pc;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                while (queue.isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int item = queue.poll();
                System.out.println(Thread.currentThread().getName() + " consumed: " + item);
                pc.incrementItemsProcessed();
                if (queue.size() <= pc.getWakeupThreshold()) {
                    lock.notifyAll();
                }

                if (pc.isDone()) {
                    break;
                }
            }
        }
    }
}