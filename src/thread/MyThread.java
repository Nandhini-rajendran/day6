package thread;

class demo extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is "+currentThread().getName());
    }
}
public class MyThread
{
    public static void main(String[] args)
    {
        demo t1=new demo();
        t1.setName("t1");
        t1.setPriority(5);
        demo t2=new demo();
        t2.setName("t2");
        t1.start();
        t2.start();

    }

}
