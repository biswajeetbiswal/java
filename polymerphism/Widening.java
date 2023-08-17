class One{
     void show1()
    {
        System.out.println("Super class");
    }
}
class Two extends One{
    void show()
    {
        System.out.println("Sub class");
    }
}
class Widening
{
    public static void main(String args[])
    {
        One o=(One)new Two();
        Two t=(Two)o;
        t.show1();
    }
}