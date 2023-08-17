class Msg
{
    public void show(String name)
    {
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("How are you"+name);
            }
        }
    }
}
class OurThread extends Thread
{
    Msg m;
    String name;
    OurThread(Msg m,String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
class SynchronizedBlock
{
    public static void main(String args[])
    {
        Msg m=new Msg();
        OurThread t1=new OurThread(m,"Arju");
        OurThread t2=new OurThread(m,"raju");
        t1.start();
        t2.start();
    }
}