class OddSum
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int result=0;
        for(int i=x+1;i<y;i++)
        {
            if(i%2!=0)
            {
                result+=i;
            }
        }
        System.out.println(result);
    }
}