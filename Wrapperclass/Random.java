class Random
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Random no.s between 0and 10");
        while(true)
        {
            double d=10*Math.random();
            int i=(int)d;
            System.out.println(i);
            Thread.sleep(2000);
            if(i==0)
            {
                System.exit(0);

            }
        }
    }
}