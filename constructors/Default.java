class Default
{
    String name;
    int age;
    Default()
    {
        name="Raju";
        age=22;
    }
    void display()
    {
        System.out.println("hello Iam"+name);
        System.out.println("My age is"+age);
    }
    public static void main(String args[])
    {
        Default df=new Default();
        df.display();
    }
}