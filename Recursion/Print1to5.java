class Print1to5
{
    void display(int n)
    {
        if(n==6)
        {
            return;
        }
        else{
            System.out.println(n);
            display(n+1);
        }
    }
    public static void main(String args[])
    {
        Print1to5 p=new Print1to5();
        p.display(1);
    }
}