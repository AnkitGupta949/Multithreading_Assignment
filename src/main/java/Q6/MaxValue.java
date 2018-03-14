package Q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValue extends Thread {

    private int start;
    private int end;
    private int[] arr;
    private int max=0;

    MaxValue(int s,int e,int[] arr1){
        start=s;
        end=e;
        arr=arr1;
    }


    public void run(){
        for (int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }


    public int getMax(){
        return max;
    }

}

class result{
    public static void main(String[] args) {
    int[] arr={2,5,7,1,10,3,6,28,22,18};
    MaxValue t1=new MaxValue(0,2,arr);
    MaxValue t2=new MaxValue(3,6,arr);
    MaxValue t3=new MaxValue(7,9,arr);


    t1.start();
    t2.start();
    t3.start();

    try {
        t1.join();
       t2.join();
       t3.join();
    }
    catch (InterruptedException ex){
        ex.printStackTrace();
    }

        List<Integer> list=new ArrayList<>();
    list.add(t1.getMax());
    list.add(t2.getMax());
    list.add(t3.getMax());

        System.out.println(Collections.max(list));

    }
}
