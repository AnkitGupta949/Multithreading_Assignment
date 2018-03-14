package Q7;

import java.util.Queue;
import java.util.Random;

public class Subscriber extends Thread {

        private Queue<Integer> sharedQueue;


        Subscriber(Queue<Integer> queue){
            sharedQueue=queue;
        }


        public void run(){
            while (true){
                synchronized (sharedQueue){
                    while (sharedQueue.isEmpty()){
                        System.out.println("consumer is waiting for consumer to produce data");
                        try{
                            sharedQueue.wait();
                        }
                        catch (InterruptedException ex){
                            System.out.println(ex.toString());
                        }
                    }


                    int data= sharedQueue.remove();
                    System.out.println("Consumed data "+data);

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




