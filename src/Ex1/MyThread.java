package Ex1;

public class MyThread extends Thread {

    @Override
    public void run() {
        worker();

        anotherWorker();
    }

    public static synchronized void worker() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Сон прерван. ");
        }
    }

    public synchronized void anotherWorker() {
        Thread notifier = new AnotherThread();
        notifier.start();
        try {
            notifier.join();
        }
        catch (InterruptedException e) {
            System.out.println("Поток "+ getName() + " прерван. ");
        }
    }
}
