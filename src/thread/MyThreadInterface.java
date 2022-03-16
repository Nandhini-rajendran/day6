package thread;
class demorunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("thread is :"+ Thread.currentThread().getName());
    }
}

public class MyThreadInterface
{
    public static void main(String[] args) {
        demorunnable r = new demorunnable();
        Thread t1 = new Thread(r);
        t1.setName("n1 ");
        Thread t2 = new Thread(r);
        t2.setName("n2 ");
        t1.start();
        t2.start();
    }

}
