interface Demo
{
    void calculate(int x);
}
class Example implements Demo 
{
   public void calculate(int x)
    {
        System.out.println("Square of this number: "+x*x);
    }
}
class Example_interface
{
    public static void main(String args[])
    {
        Example e=new Example();
        e.calculate(5);
    }
}
