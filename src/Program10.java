class Mythread1 extends Thread
{
    Thread intr;
    public void run()
    {
        intr.interrupt();
    }
}
public class Program10 {
    public static void main(String[] args) {
        Mythread1 thread = new Mythread1();
        System.out.println(Thread.currentThread());
        thread.intr = Thread.currentThread();
        thread.start();
        try
        {
            thread.join();

        }catch (Exception e){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Exception is :"+e);
        }

    }
}
