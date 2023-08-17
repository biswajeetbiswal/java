class A extends Thread{
    public void run()
    {
        System.out.println("isalive me");
    }
}
class IsAlive{
public static void  main(String args[])
{
    A t1=new A();
    A t2=new A();
    System.out.println(t1.isAlive());
    t1.start();
    t2.start();
}
}