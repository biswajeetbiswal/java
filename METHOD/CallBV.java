class Check
{
    void swap(int x,int y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
    }
}
class CallBV
{
    public static void main(String args[])
    {
        int a=10,b=20;
        Check ch=new Check();
        System.out.println(a+" "+b);
        ch.swap(a,b);
        System.out.println(a+ " "+b);
    }
}