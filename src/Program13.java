import java.io.*;

class MyThread4 extends Thread
{
    MyThread4(String ThreadName)
    {
        super(ThreadName);
    }

    public  void run()
    {
        System.out.println("Return the current reference of thread : "+Thread.currentThread().getName());
    }
}
public class Program13 {
    public static void main(String[] args) {

        MyThread4 t1 = new MyThread4("#0001");
        MyThread4 t2 = new MyThread4("#0002");


        System.out.println("After Changing the name without using setName method : ");
        System.out.println("Name of thread 1 : "+t1.getName());
        System.out.println("Name of thread 2 : "+t2.getName());
        System.out.println("Name of Current Thread : "+Thread.currentThread().getName());
        t1.start();


    }
}
