class A1 extends Thread
{
    public void run()
    {
        for(int i = 0;i<10;i++)
        {
            try{
                Thread.sleep(1000);
            }catch (Exception e){e.printStackTrace();}
            System.out.println(i);
        }
    }
}
public class Program08 {
    public static void main(String[] args) {
        A1 a = new A1();
        A1 a1 = new A1();
        a.run();
        a1.run();

    }
}
/*So this program do create thread a and a1 but when it call a run method instead of start
* The program will treat run method as a normal method instead of a thread so we can observe
* There will be no context switching between the execution of a.run() and a1.run()*/