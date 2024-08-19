public class mythread extends Thread
{
    public void run()
    {
        for (int i=3;i<=30;i+=3)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread Interupted");
            }
        }
    }

    public static void main(String[] args)
    {
        mythread t1=new mythread();
        mythread t2=new mythread();

        t1.setName("person 1 ");
        t2.setName("person 2 ");

        t1.start();t2.start();
    }
}
