package part14.task57;

public class MyDeadlock {
    public void runDeadlock() {

        final Object resource1 = new Object();
        final Object resource2 = new Object();
        final Object resource3 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource3) {
                    System.out.println("Thread 2: locked resource 3");
                }
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (resource3) {
                System.out.println("Thread 3: locked resource 3");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 3: locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
