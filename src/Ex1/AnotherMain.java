package Ex1;

public class AnotherMain {
    public static void main(String[] args) throws InterruptedException {

        // NEW
        Thread myThread = new MyThread();
        Thread myThread2 = new MyThread();
        System.out.println(myThread2.getName() + " is "+ myThread2.getState());

        // RUNNABLE + BLOCKED
        myThread.start();
        myThread2.start();
        System.out.println(myThread2.getName() + " is "+ myThread2.getState());


        Thread.sleep(1000);

        System.out.println(myThread2.getName() + " is "+ myThread2.getState());

        // WAITING

        Thread.sleep(5000);
        System.out.println(myThread2.getName() + " is "+ myThread2.getState());


        Thread.sleep(4000);

        // TERMINATED

        myThread.interrupt();
        myThread2.interrupt();

        myThread.join();
        myThread2.join();

        System.out.println(myThread2.getName() + " is "+ myThread2.getState());

    }
}
