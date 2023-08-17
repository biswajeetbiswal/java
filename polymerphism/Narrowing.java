class One
{
    static void show()
    {
        System.out.println("Super class");
    }
}
class Two extends One{
     static void show()
    {
        System.out.println("Sub class");
    }
}
class Narrowing
{
    public static void main(String args[])
    {
        One o=(One)new Two();
        o.show();
    }
}
//when both class are static it calls the super class.
//when both class are not static it calls the sub class.