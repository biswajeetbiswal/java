class Demo
{
    private int x=5;
    public int y=6;
    int z=9;
    protected int s=10;
    int show()
    {
        return x;
    }
}
class Access_Specifier
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        System.out.println(d.show());
        System.out.println(d.y);
        System.out.println(d.z);
        System.out.println(d.s);
    }
}