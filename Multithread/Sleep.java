class Demo extends Thread
{
    public void run()
    {
        try
        {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            Thread.sleep(2000);
        }
        }
        catch(InterruptedException i)
        {

        }
    }
}
class Sleep
{
    public static void main(String args[]) 
    {
        Demo d=new Demo();
        d.start();
    }
}