import javax.naming.Name;

class NameThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running : ");
    }

}
public class Program12 {
    public static void main(String[] args)
    {
        NameThread t1 = new NameThread();
        NameThread t2 = new NameThread();


        System.out.println("Before Changing the name : ");
        System.out.println(t1.getName());
        System.out.println(t1.getName());

        System.out.println("After Changing THe name : ");
        t1.setName("#T#R#990");
        t2.setName("#T#R#991");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

    }
}
