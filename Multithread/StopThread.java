class Demo extends Thread
{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(n);
        }
    }
}
class StopThread
{
    public static void main(String args[])
    {
       A t1=new A();
       A t2=new A();
       A t3=new A();
       t1.setName("Raju");
       t2.setName("manas");
       t3.setName("Amit");
       t1.start();
       t2.start();
       t3.start();
       t2.stop();
    }
}