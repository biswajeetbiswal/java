class Demo
{
    String name;
    int age;
    Demo()
    {
      name="Biswa";
      age=22;  
    }
    Demo(String s,int i)
    {
        name=s;
        age=i;
    }
    void display()
    {
        System.out.println("Hello I am "+name);
        System.out.println("My age is "+age);

    }
}
class Parameterise
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.display();
        Demo f=new Demo("Bubu",21);
        f.display();
        
    }
}