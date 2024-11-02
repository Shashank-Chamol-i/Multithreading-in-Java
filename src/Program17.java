import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread09 implements Runnable
{
    private String taskName;
    public MyThread09(String str)
    {
        this.taskName = str;
    }
    public void run()
    {
        try
        {
            for(int i = 0;i<5;i++)
            {
                if(i==0)
                {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
                    System.out.println("Initialization  of TIme :  = "+sdf.format(date));
                }else
                {
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss ");
                    System.out.println("Execution of Time : = "+sdf.format(date));
                }
                System.out.println(taskName+" is Completed : ");
            }
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Program17 {
    static final int num = 3;
    public static void main(String[] args) {
        Runnable r1 = new MyThread09("Task01");
        Runnable r2 = new MyThread09("Task02");
        Runnable r3 = new MyThread09("Task03");
        Runnable r4 = new MyThread09("Task04");
        Runnable r5 = new MyThread09("Task05");

        ExecutorService ex = Executors.newFixedThreadPool(num);
        ex.execute(r1);
        ex.execute(r2);
        ex.execute(r3);
        ex.execute(r4);
        ex.execute(r5);

        ex.shutdown();

    }

}
