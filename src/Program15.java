class MyThread6 extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread : ");
        }else
        {
            System.out.println("Not a Daemon Thread : ");
        }
    }
}
public class Program15 {
    public static void main(String[] args) {
    MyThread6 t1 = new MyThread6();
    MyThread6 t2 = new MyThread6();
    MyThread6 t3 = new MyThread6();
/*Daemon thread must be created before starting a thread else it will provide a
* IllegalThreadStateException */
    t1.setDaemon(true);
    t1.start();
    t2.start();
    t3.start();
    }
}
