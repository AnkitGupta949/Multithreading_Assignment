package Q8;

import java.util.concurrent.BlockingQueue;

public class Subscriber extends Thread {
    BlockingQueue<Integer> blockingQueue;

    public Subscriber(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run(){
        while (true){
            int data=0;
            try {

                 data=blockingQueue.take();
                 sleep(1000);
            }
            catch (Exception ex){
                System.out.println(ex.toString());
            }
            System.out.println("subscribed :"+data);
        }
    }
}
