import java.util.*;
class First
{
    void display(int x,int y)
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
class Second extends First{
    
    void insert(int x,int y,int z)
    {
        display(x,y);
        System.out.println("z = "+z);
    }
}
class Third extends Second{
    void show(int x,int y,int z,int r)
    {
        insert(x,y,z);
        System.out.print("R = "+r);
    }
}
class Multilevel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of first number:");
        int s=sc.nextInt();
        System.out.print("Enter value of second number:");
        int t=sc.nextInt();
        System.out.print("Enter value of third number:");
        int u=sc.nextInt();
        System.out.print("Enter value of fourth number:");
        int v=sc.nextInt();
       Third g=new Third();
       g.show(s,t,u,v);
       g.display(s,t);
       g.insert(s,t,u);
    }
}