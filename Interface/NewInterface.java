interface area
{
   float pi=3.14F;
   float calculate(float x,float y);
}
class Rectangle implements area
{
    public float calculate(float x,float y)
    {
        return x*y;
    }
}
class Circle implements area
{
    public float calculate(float x,float y)
    {
        return pi*x*x;
    }
    
}
class NewInterface
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        area a;
        a=r;
        System.out.println("Arae of rectangle is:"+a.calculate(4,5));
        a=c;
        System.out.println("Arae of circle is:"+a.calculate(4,0));
    }
}