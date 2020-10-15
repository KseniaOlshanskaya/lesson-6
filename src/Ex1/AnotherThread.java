package Ex1;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Сон прерван. ");
        }
    }
}


