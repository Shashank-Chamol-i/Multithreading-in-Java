/*Program Implementation to Demonstrate the thread state */
class ABC implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(100);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("State of thread t1 when method t2.join() is invoked : "+ Program01.t1.getState());
        try
        {
            Thread.sleep(200);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class Program01 implements Runnable {
    public static Thread t1;
    public static Program01 obj;
    public static void main(String[] args) {
             obj = new Program01();
             t1 = new Thread(obj);

        System.out.println("State of the thread after Spawing it : "+ t1.getState());

        t1.start();
        System.out.println("State of the thread after start : "+t1.getState());
    }
    public void run()
    {
        ABC obj1 = new ABC();
        Thread t2 = new Thread(obj1);
        System.out.println("State of thread after spawing it: "+t2.getState());
        t2.start();
        System.out.println("State of thread after start : "+t2.getState());
        try
        {
            Thread.sleep(200);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("The state of Thread t2 after invoking the sleep"+t2.getState());
        try
        {
            t2.join();
        }catch (Exception e)
        {
           e.printStackTrace();
        }
        System.out.println("The state of thread t2 after when it has completed execution "+t2.getState());
    }
}
