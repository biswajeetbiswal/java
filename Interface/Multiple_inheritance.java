interface A{
    void show();
}
interface B{
    void display();
}
class Multiple_inheritance implements A,B{
   public  void show()
    {
        System.out.println("show the method");
    }
    public void display()
    {
        System.out.println("display the method");
    }
    public static void main(String args[])
    {
        Multiple_inheritance m=new Multiple_inheritance();
        m.show();
        m.display();
    }
}