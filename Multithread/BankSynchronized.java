class Bank extends Thread
{
    int bal=5000;
    int withdraw;
    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name+" Withdraw money");
            bal=bal-withdraw;
        }
        else
        {
            System.out.println(name+" Insufficient balance");
        }
    }
}
class BankSynchronized
{
    public static void main(String args[])
    {
        Bank b=new Bank(5000);
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        t1.setName("raju");
        t2.setName("sunita");
        t1.start();
        t2.start();
    }
}