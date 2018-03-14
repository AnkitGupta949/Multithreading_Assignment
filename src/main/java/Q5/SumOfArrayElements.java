package Q5;

public class SumOfArrayElements extends Thread {
    private int start;
    private int end;
    int[] arr;
    int sum=0;

    SumOfArrayElements(int s,int e,int[] arr1){
        start=s;
        end=e;
        arr=arr1;

    }


    public void run(){
        for(int i=start;i<=end;i++){
            sum=sum+arr[i];
        }
    }


    public int getSum(){
        return sum;
    }

}


class result{
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8 };

        SumOfArrayElements thread1=new SumOfArrayElements(0,2,arr);
        SumOfArrayElements thread2=new SumOfArrayElements(3,5,arr);
        SumOfArrayElements thread3=new SumOfArrayElements(6,7,arr);


        thread1.start();
        thread2.start();
        thread3.start();

        try{

            thread1.join();
            thread2.join();
            thread3.join();



        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("sum is : "+thread1.getSum()+thread2.getSum()+thread3.getSum());

    }
}
