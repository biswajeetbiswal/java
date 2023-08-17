//import java.lang.Thread;
class One extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("i= "+i);
        }
    }
}
class Two extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("j= "+i);
        }
    }
}
class Three extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("k= "+i);
        }
    }
}
class First
{
    public static void main(String args[])
    {
       /* new One().start();
        new Two().start();
        new Three().start();*/
        One o=new One();
        Thread f=new Thread(o);
        f.start();
        Two t=new Two();
        t.start();
        Three r=new Three();
        r.start();
    }
}