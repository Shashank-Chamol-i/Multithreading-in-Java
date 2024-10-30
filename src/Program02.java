class A extends Thread
{
    public void run()
    {
        System.out.println("Thread is Running : ");
    }
}
public class Program02 {
    public static void main(String[] args) {
        A t1 = new A();
        t1.start();
    }
}
