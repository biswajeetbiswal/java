interface printable
{
    void print();
}
class Interface1 implements printable
{
    public void print()
    {
        System.out.println("hello");
    }
    public static void main(String args[])
    {
        Interface1 obj=new Interface1();
        obj.print();
    }
}
