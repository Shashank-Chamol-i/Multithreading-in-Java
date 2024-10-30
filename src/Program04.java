
public class Program04 {
    public static void main(String[] args) {
        Thread t = new Thread("RED");
        Thread t1 = new Thread("WHITE");
        t.start();
        String str = t.getName();
        String str2= t1.getName();
        System.out.println(str+" "+str2);



    }
}
