package Q8;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Publisher extends Thread {

    BlockingQueue<Integer> blockingQueue;

    public Publisher(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void run(){
        while (true){
            Random random=new Random();
            int data= random.nextInt(20);
            try{
                blockingQueue.put(data);
                sleep(1000);
            }
            catch (InterruptedException ex){
                System.out.println(ex.toString());
            }
            System.out.println("published :"+data);

        }
    }
}
