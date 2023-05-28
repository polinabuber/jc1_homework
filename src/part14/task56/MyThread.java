package part14.task56;

public class MyThread extends Thread {
    private static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println(getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
