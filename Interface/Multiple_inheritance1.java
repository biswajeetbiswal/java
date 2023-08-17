interface A
{
    void squre(int x);
}
interface B
{
    void cube(int y);
}
class C implements A,B
{
    public void squre(int x)
    {
        System.out.println("Squre of x is: "+x*x);
    }
    public void cube(int y)
    {
        System.out.println("cube of a y is: "+y*y*y);
    }
}
class Multiple_inheritance1
{
    public static void main(String args[])
    {
        C cc=new C();
        cc.squre(5);
        cc.cube(6);
    }
}