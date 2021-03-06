package lab4_zad2;

public class Main {
    private static final int PRODUCERS_AMOUNT = 4;
    private static final int CUSTOMERS_AMOUNT = 4;

    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer[] producers = new Producer[PRODUCERS_AMOUNT];
        for(int i = 0; i < producers.length; i++) {
            producers[i] = new Producer(buffer);
            new Thread(producers[i]).start();
        }

        Consumer[] consumers = new Consumer[CUSTOMERS_AMOUNT];
        for(int i = 0; i < consumers.length; i++) {
            consumers[i] = new Consumer(buffer);
            new Thread(consumers[i]).start();
        }

    }
}
