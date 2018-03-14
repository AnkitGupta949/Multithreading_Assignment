package Q8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(10);
        Publisher publisher=new Publisher(blockingQueue);
        Subscriber subscriber=new Subscriber(blockingQueue);
        publisher.start();
        subscriber.start();
    }
}
