import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter2 {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

// Separate class for main method
public class Task8 {
    public static void main(String[] args) {
        Counter2 counter = new Counter2();

        // Create two threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start threads
        t1.start();
        t2.start();

        try {
            // Wait for threads to complete
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
