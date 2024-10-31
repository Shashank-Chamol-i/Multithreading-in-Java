class Mythread extends Thread
{
    public void run()
    {
        for(int i = 0;i<2;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("Exception : "+e);
            }
            System.out.println(i);
        }
    }
}
public class Program09 {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();

        t1.start();

        try
        {
            System.out.println(Thread.currentThread().getName());
            t1.join();
        }catch (Exception e){e.printStackTrace();}

        t2.start();
        try
        {
            System.out.println(Thread.currentThread().getName());
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        t3.start();
    }
}
/*Sequence of program
* 1 - Main run
* 2- Along with main t1 run
* 3 - main pause till t1 complete
* 4 - main continue
* 5 -main running now t2 starts
* 6 -t2 continue main paused
* 7 - t2 complete main continue
* 8 - main run and t3 start
* 9 - Both end at the end of program*/