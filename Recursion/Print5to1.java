class Print5to1
{
    void display(int n)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            System.out.println(n);
            display(n-1);
        }
    }
    public static void main(String args[])
    {
        Print5to1 p=new Print5to1();
        p.display(5);
    }
}