class Check
{
    private int x;
    void modify(int a)
    {
         
        x=a;
    }
    void access()
    {
        System.out.println("x= "+x);
       // System.out.println(a); here we can't access the value of "a" because it is a local varible
    }
    public static void main(String args[])
    {
        Check ch =new Check();
        ch.modify(10);
        ch.access();
    }
}