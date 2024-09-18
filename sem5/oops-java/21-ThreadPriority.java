class MyThread extends Thread {
    private int threadNumber;

    MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " with priority " + getPriority() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadNumber + " - Count: " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadNumber + " interrupted.");
            }
        }
        System.out.println("Thread " + threadNumber + " completed.");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create three threads
        MyThread thread1 = new MyThread(1);
        MyThread thread2 = new MyThread(2);
        MyThread thread3 = new MyThread(3);

        // Set priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have completed.");
    }
}
