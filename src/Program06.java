class Sleeping extends Thread
{
    public void run()
    {
        for(int i = 0;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
public class Program06 {
    public static void main(String[] args) {
        Sleeping s1 =  new Sleeping();
        Sleeping s2 = new Sleeping();
        s1.start();
        s2.start();
    }
}
/*
* If i comment out the thread.sleep method area it will result in mixed up numbers
* Which show that two threads are running parallel and whose execution finishes first print the
* element no matter what is the order */