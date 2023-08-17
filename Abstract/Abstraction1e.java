abstract class Demo
{
    abstract void calculate(int x);
};
class Sub1 extends Demo
{
    void calculate(int x)
    {
        System.out.println("Square of x= "+x*x);
    }
}
class Sub2 extends Demo
{
    void calculate(int x)
    {
        System.out.println("Cube of x= "+x*x*x);
    }
}
class Abstraction1e
{
    public static void main(String args[])
    {
        Sub1 s1=new Sub1();
        s1.calculate(5);
        Sub2 s2=new Sub2();
        s2.calculate(6);
    }
}