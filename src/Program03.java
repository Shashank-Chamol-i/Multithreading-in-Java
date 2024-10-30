class B implements Runnable
{
    public void run()
    {
        System.out.println("Runnable thread is Running : ");
    }
}
public class Program03 {
    public static void main(String[] args) {
        B b = new B();
        Thread t2 = new Thread(b);
        t2.start();
    }

}
