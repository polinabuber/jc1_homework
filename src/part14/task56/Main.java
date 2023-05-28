package part14.task56;

public class Main {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }
    }
}