import java.util.*;
class Demo
{
    String name;
    int age;
    Demo(String s,int i)
    {
        name=s;
        age=i;
    }
    void display()
    {
        if(age<=30)
        {
            System.out.println(name+" is young");
        }
        else if(age<=50)
        {
            System.out.println(name+" is middle aged"); 
        }
        else{
            System.out.println(name+" is old");
        }
    }
}
class Person
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String x=sc.nextLine();
        System.out.println("Enter age:");
        int y=sc.nextInt();
        Demo d=new Demo(x,y);
        d.display();
    }
}