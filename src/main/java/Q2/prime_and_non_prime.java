package Q2;

public class prime_and_non_prime {

    public void print(){
        for (int i=1;i<=20;i++){
                boolean prime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    System.out.println(Thread.currentThread().getName()+" :non prime :"+i +"  ");
                    prime=false;
                    break;
                }
            }
                if(prime){
                    System.out.println(Thread.currentThread().getName()+" :prime :"+i);
                }
        }
    }

    public static void main(String[] args) {
//        new prime_and_non_prime().print();
        new Thread(()->new prime_and_non_prime().print()).start();
        new Thread(()->new prime_and_non_prime().print()).start();

    }
}
