class First implements Runnable
{
    public void run()
    {
         for(int i=0;i<5;i++)
        {
            System.out.println("Biswajeet");
        }
    }
}
class Second implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Ashish");
        }
    }
}
class Demo1
{
    public static void main(String args[])
    {
        First f=new First();
        Thread t1=new Thread(f);
        t1.start();
        Second s=new Second();
        Thread t2=new Thread(s);
        t2.start();
    }
}