package Q7;

import java.util.Queue;
import java.util.Random;

public class Publisher extends Thread {

    private Queue<Integer> sharedQueue;


    Publisher(Queue<Integer> queue){
        sharedQueue=queue;
    }


    public void run(){
        while (true){
            synchronized (sharedQueue){
                while (sharedQueue.size()==10){
                    System.out.println("producer is waiting for consumer to consume data");
                    try{
                        sharedQueue.wait();
                    }
                    catch (InterruptedException ex){
                        System.out.println(ex.toString());
                    }
                }

                Random random=new Random();
                int data=random.nextInt(20); //give value between 0 to 20
                System.out.println("produced data :"+data);
                sharedQueue.add(data);
                try{
                 sharedQueue.notify();
                 sleep(1000);
                }
                catch (Exception ex){
                    System.out.println(ex.toString());
                }


            }
        }
    }

}
