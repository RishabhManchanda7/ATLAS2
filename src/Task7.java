class Counter1 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Task7 {
    public static void main(String[] args) {
        Counter1 counter = new Counter1();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start the threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to complete
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final count
        System.out.println("Final count: " + counter.getCount());
    }
}