import java.time.Duration;

class Mythread2 extends Thread {
    public void run()
    {
        for(int i = 0;i<6;i++)
        {
            try
            {
                Thread.sleep(1000);
            }catch (Exception e){e.printStackTrace();}
            System.out.println(i);
        }
    }
}
public class Program11 {
    public static void main(String[] args) {
        Mythread2 t1 = new Mythread2();
        Mythread2 t2 = new Mythread2();
        t1.start();
        try{
            t1.join(150);
        }catch (Exception e){e.printStackTrace();}
        t2.start();
    }
}
