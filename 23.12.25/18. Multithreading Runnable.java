class MyRun implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRun(), "Thread 1");
        Thread t2 = new Thread(new MyRun(), "Thread 2");

        t1.start();
        t2.start();
    }
}
