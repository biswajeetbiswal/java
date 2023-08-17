class A extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class Priority{
    public static void main(String args[])
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("Ram");
        t2.setName("Raju");
        t3.setName("Amar");
        t1.setPriority(10);
        t2.setPriority(3);
        t3.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
    }
}