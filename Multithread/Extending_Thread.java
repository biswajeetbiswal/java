class Demo extends Thread
{
    public void run()
    {
        try
        {
         for(int i=0;i<5;i++)
         {
            System.out.println("i= "+i);
            Thread.sleep(1000);
         }
        }
        catch(InterruptedException i)  
        {
        }     
    }
}
class Extending_Thread
{
    public static void main(String args[]) throws InterruptedException
    {
        Demo d=new Demo();
        d.start();
        for(int j=6;j<=10;j++)
        {
            System.out.println("j= "+j);
            Thread.sleep(1000);
        }
    }
}