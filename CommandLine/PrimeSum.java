class PrimeSum
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int result=0;
        for(int i=x;i<=y;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                result+=i;
            }
        }
        System.out.println(result);
    }
}