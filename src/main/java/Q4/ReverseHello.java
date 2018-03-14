package Q4;

public class ReverseHello {

    public void create(){
        Mythread1 mythread1=new Mythread1();
        mythread1.start();
    }

    public static void main(String[] args) {
        new ReverseHello().create();
    }

}

class Mythread1 extends Thread{
    public void run(){

        Mythread2 mythread2=new Mythread2();
                mythread2.start();
        try{
            mythread2.join();
            System.out.println("hello from thread 1 ");
        }
        catch(Exception e){

        }

    }
}
class Mythread2 extends Thread{
    public void run(){
        Mythread3 mythread3=new Mythread3();
        mythread3.start();
        try{
            mythread3.join();

            System.out.println("hello from thread 2 ");
        }
        catch(Exception e){

        }

    }
}
class Mythread3 extends Thread{
    public void run(){
        Mythread4 mythread4=new Mythread4();
        mythread4.start();
        try{
           mythread4.join();
        }
        catch(Exception e){

        }


        System.out.println("hello from thread 3 ");
    }
}

class Mythread4 extends Thread{
    public void run(){
        Mythread5 mythread5=new Mythread5();
        mythread5.start();
        try{
            mythread5.join();
        }
        catch(Exception e){

        }
        System.out.println("hello from thread 4 ");
    }
}
class Mythread5 extends Thread{
    public void run(){
        Mythread6 mythread6=new Mythread6();
        mythread6.start();
        try{
            mythread6.join();
        }
        catch(InterruptedException e){

        }
        System.out.println("hello from thread 5 ");
    }
}
class Mythread6 extends Thread{
    public void run(){
        Mythread7 mythread7=new Mythread7();

        mythread7.start();
        try{
          mythread7.join();
        }
        catch(InterruptedException e){

        }
        System.out.println("hello from thread 6 ");
    }
}
class Mythread7 extends Thread{
    public void run(){
        Mythread8 mythread8=new Mythread8();
        mythread8.start();
        try{
            mythread8.join();
        }
        catch(InterruptedException e){

        }
        System.out.println("hello from thread 7 ");
    }
}
class Mythread8 extends Thread{
    public void run(){
        Mythread9 mythread9=new Mythread9();
        mythread9.start();
        try{
            mythread9.join();
        }
        catch(InterruptedException e){

        }
        System.out.println("hello from thread 8 ");
    }
}
class Mythread9 extends Thread{
    public void run(){
        Mythread10 mythread10=new Mythread10();
        mythread10.start();
        try{
            mythread10.join();
        }
        catch(InterruptedException e){

        }
        System.out.println("hello from thread 9 ");
    }
}
class Mythread10 extends Thread{
    public void run(){
        try{
            sleep(10);
        }
        catch(InterruptedException e){

        }
        System.out.println("hello from thread 10 ");
    }
}


