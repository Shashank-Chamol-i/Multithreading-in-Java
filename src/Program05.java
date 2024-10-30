class Run implements Runnable
{
    public void run()
    {

        System.out.println("New Thread is running");
    }
}
public class Program05 {
    public static void main(String[] args) {
        Run r = new Run();
        Thread t = new Thread(r,"My new thread : ");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }
}
/*You call t.start(), which triggers the run() method in a separate thread (t).
However, immediately after starting t, the main thread continues executing the next lines
 (getName() and System.out.println(str);).
 */
/*The output order then depends on which thread completes first:
If the main thread executes System.out.println(str);
before t starts running System.out.println("New Thread is running");, you’ll see "My new thread : " printed first.
 */
/*If t begins executing its run() method first, you’ll see "New Thread is running" first.*/