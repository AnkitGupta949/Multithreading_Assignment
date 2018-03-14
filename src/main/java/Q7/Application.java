package Q7;

import java.util.LinkedList;
import java.util.Queue;

public class Application {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Publisher publisher1=new Publisher(queue);
        Subscriber subscriber1=new Subscriber(queue);
        publisher1.start();
        subscriber1.start();
    }
}
