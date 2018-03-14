package Q3;

public class printing {

    public synchronized void print(){
        for(int i=1;i<=3;i++){

                System.out.println(Thread.currentThread().getName()+" : "+i);



        }
    }

    public static void main(String[] args) {
                new Thread(()->new printing().print()).start();
        new Thread(()->new printing().print()).start();


    }
}
