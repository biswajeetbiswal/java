abstract class Car
{
    //instance variable
    int regno;
    //constructor
    Car(int r)
    {
        regno=r;
    }
    //concrete method
    void openTank()
    {
        System.out.println("Fill the tank");
    }
    //abstract method
    abstract void steering(int direction,int angle);
    abstract void breaking(int force);
}
class Maruti extends Car{
    Maruti(int regno)
    {
        super(regno);
    }
    void steering(int direction,int angle)
    {
        System.out.println("Take 1a turn");
        System.out.println("This is ordinary streering");
    }
    void breaking(int force)
    {
        System.out.println("Breaks applied");
        System.out.println("These are hydrulic breaks");
    }
    void show()
    {
        System.out.println("display");
    }
}
class Santro extends Car{
    Santro(int regno)
    {
        super(regno);
    }
    void steering(int direction,int angle)
    {
      System.out.println("Take a turn");
      System.out.println("This is ordinary streering");  
    }
    void breaking(int force)
    {
        System.out.println("Braeks applied");
        System.out.println("These are hydrulic breaks");
    }
}
class Abstract2
{
    public static void main(String args[])
    {
        Maruti m=new Maruti(1001);
        Santro s=new Santro(1002);
        Car ref;
        ref=m;
        m.show();//but we cant call using super class reference  ref.show();
        m.openTank();
        ref.steering(1,90);
        ref.breaking(500);
    }
}