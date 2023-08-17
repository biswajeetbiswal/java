class Demo extends Thread{
    int available=1;
    int wanted;
    Demo(int i)
    {
        wanted=i;
    }
    public void run()
    {
        System.out.println("Available Berths= "+available);
        if(available>=wanted)
        {
            String name=Thread.currentThread().getName();
            System.out.println(wanted+" Berths reserved for "+name);
            try{
                Thread.sleep(1500);
                available=available-wanted;
            }
            catch(InterruptedException ie)
            {}
        }
        else
        {
            System.out.println("Sorry,nobreths");
        }
    }
    class Multithread
    {
        public static void main(String args[])
        {
            Demo d=new Demo(1);
            Thread t1=new Thread(d);
            Thread t2=new Thread(d);
             t1.setName("First Person");
             t2.setName("Second person");
             t1.start();
             t2.start();
        }
    }
}