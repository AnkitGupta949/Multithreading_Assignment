package Q1;

public class print_ascending {
    public static void main(String[] args) {
MyThread1 thread1=new MyThread1();
MyThread2 thread2=new MyThread2();
thread1.setName("t1");
thread2.setName("t2");

thread1.start();
thread2.start();

    }
}
