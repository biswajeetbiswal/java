interface Drawable
{
    void draw();
}
class Rectangle implements Drawable
{
    public void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("drawing circle");
    }
}
class Testinterface
{
    public static void main(String args[])
    {
        Circle d=new Circle();
        d.draw();
    }

}