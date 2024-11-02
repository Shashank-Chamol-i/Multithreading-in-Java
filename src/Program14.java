class MyThread5 extends Thread
{
    public void run()
    {
        System.out.println(" : ");
    }
}
public class Program14 {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();
        MyThread5 t3 = new MyThread5();

        System.out.println("t1 : "+t1.getPriority());
        System.out.println("t2 : "+t2.getPriority());
        System.out.println("t3 : "+t3.getPriority());

        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(5);
        System.out.println("T1 : "+t1.getPriority());
        System.out.println("T2 : "+t2.getPriority());
        System.out.println("T3 : "+t3.getPriority());

    }
}
