class First extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Biswajeet");
        }
    }
}
class Second extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Ashish");
        }
    }
}
class Demo
{
    public static void main(String args[])
    {
        First f=new First();
        f.start();
        Second s=new Second();
        s.start();
    }
}