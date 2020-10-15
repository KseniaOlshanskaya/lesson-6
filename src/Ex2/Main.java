package Ex2;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        MusicalShop shop = new MusicalShop();

        Producer producer = new Producer(shop);
        producer.start();
        Customer consumer = new Customer(shop);
        consumer.start();

        Thread.sleep(10000);
        
        producer.interrupt();
        consumer.interrupt();
        producer.join();
        consumer.join();

    }
}
