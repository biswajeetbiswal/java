abstract class Myclass
{
    abstract void calculate(double x);

    void display()
    {
        System.out.println("Non abstract method");
    }
}
class Sub1 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("square ="+(x*x));
    }
}
class Sub2 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("Square root ="+Math.sqrt(x));
    }
}
class Sub3 extends Myclass
{
    void calculate(double x)
    {
        System.out.println("cube ="+(x*x*x));
    }
}
class Abstract1
{
    public static void main(String args[])
    {
        Sub1 obj1=new Sub1();
        Sub2 obj2=new Sub2();
        Sub3 obj3=new Sub3();
        obj1.calculate(3);
        obj1.display();
        obj2.calculate(4);
        obj3.calculate(5);
    }
}