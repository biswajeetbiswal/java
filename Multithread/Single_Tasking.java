class Demo extends Thread
{
    public void run()
    {
        task1();
        task2();
        task3();
    }
    void task1()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("i= "+i);
        }
    }
    void task2()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("j= "+i);
        }
    }
    void task3()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("k= "+i);
        }
    }
}
class Single_Tasking
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        Thread t = new Thread(d);
        t.start();
    }
}