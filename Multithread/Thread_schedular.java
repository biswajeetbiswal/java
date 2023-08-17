class Demo extends Thread{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(n);
        }
    }

}
class Thread_schedular
{
    public static void main(String args[])
    {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.setName("Ramesh");
        d2.setName("arup");
        d3.setName("somya");
        d1.start();
        d2.start();
        d3.start();
    }
}