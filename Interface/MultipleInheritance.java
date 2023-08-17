class Student
{
    int roll;
    void getroll(int n)
    {
        roll=n;
    }
    void putroll()
    {
        System.out.println("Roll="+roll);
    }
}
class test extends Student{
    float mark1,mark2;
    void getmarks(float m1,float m2)
    {
        mark1=m1;
        mark2=m2;
    }
    void putmark()
    {
        System.out.println("Marks1="+mark1+"\nmark2="+mark2);
    }
}
interface sports
{
    float sportsmark=6.0F;
    void putsport();
}
class result extends test implements sports
{
    float total;
    public void putsport()
    {
        System.out.println("Sportsmark="+sportsmark);
    }
    void display()
    {
        total=mark1+mark2+sportsmark;
        putroll();
        putmark();
        putsport();
        System.out.println("Total marks="+total);
    }
}
class MultipleInheritance
{
    public static void main(String args[])
    {
        result aa=new result();
        aa.getroll(10);
        aa.getmarks(30.5F,35.9F);
        aa.display();
    }
}