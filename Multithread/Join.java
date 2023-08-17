class A extends Thread{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(n);
        }
    }
}
class Join
{
    public static void main(String args[])
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("Ram");
        t2.setName("RAju");
        t3.setName("Amit");
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException i)
        {

        }
        t1.start();
        t3.start();
    }
}