class First
{
    int i=10;
    void show()
    {
        System.out.println("Super class method:i "+i);
    }
}

    class Second extends First
    {
        int i=20;
        void show()
        {
            System.out.println("Sub class method:i "+i);
            super.show();
            System.out.println("Super i: "+super.i);
        }
    }
    class Super
    {
        public static void main(String args[])
        {
            Second s=new Second();
            s.show();
        }
    }
