class One
{
    void display()
    {
        System.out.println("Super");
    }
}
class Two extends One 
{
    void show()
    {
        System.out.println("Sub");
    }
}
class Tc1
{
    public static void main(String args[])
    {
       One o=new Two();
       Two t=(Two)o;
        t.display();
        t.show();
        
    }
}