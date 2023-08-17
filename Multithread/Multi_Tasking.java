class Demo extends Thread
//class Demo implements Runnable
{
    String str;
    Demo(String str)
    {
        this.str=str;
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(str+" "+i);
            try
            {
                Thread.sleep(5 000);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
class Multi_Tasking
{
    public static void main(String args[])
    {
        Demo d=new Demo("Cut the Tickets");
        Demo d1=new Demo("Show the Seat");
        Thread t=new Thread(d);
        Thread t1=new Thread(d1);
        t.start();
        t1.start();
    }
}