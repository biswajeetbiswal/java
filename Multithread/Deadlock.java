class BookTicket extends Thread
{
    Object train,comp;
    BookTicket(Object train,Object comp)
    {
        this.train=train;
        this.comp=comp;
    }
    public void run()
    {
        synchronized(train)
        {
            System.out.println("BookTickets locked on train");
            try
            {
                Thread.sleep(150);
            }
            catch(InterruptedException e)
            {}
            System.out.println("BookTicket now waiting to lock on compartment");
            synchronized(comp)
            {
                System.out.println("BookTickets locked on compartment");
            }
        }
    }
}
    class CancelTickets extends Thread{
        Object train,comp;
        CancelTickets(Object train,Object comp)
        {
            this.train=train;
            this.comp=comp;
        }
        public void run()
        {
            synchronized(train)
            {
                System.out.println("CancelTickets locked on compartment");
                try{
                   Thread.sleep(200); 
                }
                 catch(InterruptedException e)
                 {}
                 System.out.println("Canceltickets now waiting to lock on train..");
                 synchronized(comp)
                 {
                    System.out.println("CancelTickets locked on train");
                 }
            }
        }
    }
    class Deadlock
    {
        public static void main(String args[])
        {
            Object train=new Object();
            Object compartment=new Object();
            BookTicket obj1=new BookTicket(train,compartment);
            CancelTickets obj2=new CancelTickets(train,compartment);
            Thread t1=new Thread(obj1);
            Thread t2=new Thread(obj2);
            t1.start();
            t2.start();
        }
    }
