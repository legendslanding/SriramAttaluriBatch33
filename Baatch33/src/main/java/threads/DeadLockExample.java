package threads;

public class DeadLockExample {
    static Object o1 = new Object();
    static Object o2 = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (o1) {
                System.out.println("Thread 1: Acquired resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for resource2...");
                synchronized (o2) {
                    System.out.println("Thread 1: Acquired resource2");
                }
            }
        });


        Thread thread2 = new Thread(() -> {
            synchronized (o2) {
                System.out.println("Thread 2: Acquired resource2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for resource1...");
                synchronized (o1) {
                    System.out.println("Thread 2: Acquired resource1");
                }
            }
        });


        thread1.start();
        thread2.start();
    }
}
