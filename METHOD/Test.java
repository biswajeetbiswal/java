class Test{
    int x=10;
    static int y=20;
    void display()
    {
        System.out.println(x);
    }
    static void dis()
    {
        System.out.println(y);
        

    }
    public static void main(String args[])
    {
        Test t1,t2;
        t1=new Test();
        t2=new Test();
        ++t1.x;
        ++t1.y;
        t1.display();
        t2.display();
        t1.dis();
        t2.dis();
    }
}