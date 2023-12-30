package y2021;

public class SynchronizedBlock {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int counter = 0;

    public synchronized void m1(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i in m1 : " + i);
            sleep(10);
            counter++;
        }
    }

    public static synchronized void m2(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i in m2 : " + i);
            sleep(10);
            counter--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        SynchronizedBlock o = new SynchronizedBlock();
        Runnable run_1 = () -> o.m1(Thread.currentThread().getName());
        Runnable run_2 = () -> m2(Thread.currentThread().getName());
        Thread t3 = new Thread(run_1, "thread-3");
        Thread t4 = new Thread(run_2, "thread-4");
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("case-1 counter : " + counter);
    }
}
