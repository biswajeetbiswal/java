import java.util.*;
class First
{
    int x;
    void display(int x,int y)
    {
        this.x=x;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
class Second extends First{
    void insert(int x,int y,int z)
    {
        display(x,y);
        int a=super.x;
        System.out.println("a = "+a);
        System.out.print("z = "+z);
    }
}
class Simple
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
        Second se=new Second();
        se.insert(s,t,u);
    }
}