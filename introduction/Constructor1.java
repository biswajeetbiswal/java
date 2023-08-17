class Demo
{
    //Deafault constructor
    Demo()
    {
        System.out.println("Start Programming");
    }
    //Parameterised constructor
    Demo(int x,int y)
    {
        System.out.println("Multiplication is:"+x*y);
    }
    //Constructor overloading
    Demo(double x,double y)
    {
        System.out.println("Multiplication1 is:"+x*y);
    }
}
class Constructor1
{
    public static void main(String args[])
    {
        Demo obj1=new Demo();
        Demo obj2=new Demo(5,3);
        Demo obj3=new Demo(2.0,3.0);
    }
}