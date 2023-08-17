class Demo implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Print");
        }
    }
}
class Implementing_Runnable
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        Thread t=new Thread(d);
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Show");
        }
    }
}