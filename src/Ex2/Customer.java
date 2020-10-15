package Ex2;

import java.util.Random;

public class Customer extends Thread{
    MusicalShop shop;

    public Customer(MusicalShop shop) {
        this.shop = shop;
    }

    public void run() {
        while(!isInterrupted()) {
            try {
                Random random = new Random();
                int i = random.nextInt(900 + 1);
                i += 100;
                sleep((long)i);

            } catch (InterruptedException e) {
                break;
            }
            shop.buy();
        }
    }
}
