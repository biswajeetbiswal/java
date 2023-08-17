class Demo extends Thread{
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("i= "+i);
        }
    }
}
class Second
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        Thread t=new Thread(d);
        t.start();
    }
}