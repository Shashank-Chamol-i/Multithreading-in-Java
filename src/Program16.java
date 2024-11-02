
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread08 implements Runnable
{
    private String message;
    MyThread08(String message)
    {
        this.message = message;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"(start) message : "+message);
        sleeping();
        System.out.println(Thread.currentThread().getName()+"(End)");
    }
    private void sleeping()
    {
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Program16 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for(int i = 0;i<10; i++)
        {
            Runnable rn = new MyThread09(" "+i);
            ex.execute(rn);
        }
        ex.shutdown();
        while(!ex.isTerminated())
        {

        }
        System.out.println("All thread finished  : ");
    }
}
