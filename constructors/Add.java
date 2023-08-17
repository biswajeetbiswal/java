import java.util.*;
class Add
{
    int z;
    Add(int a,int b)
    {
        int x=a;
        int y=b;
        z=x+y;
        System.out.println("sum "+z);
    }
    void display()
    {
        System.out.println("Sum is:"+z);
    }
    Add(int n)
    {
        int x=n;
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of a number is : "+fact);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number:");
        int c=sc.nextInt();
        System.out.print("Enter second number:");
        int d=sc.nextInt();
        Add num=new Add(c,d);
        num.display();
        Add s=new Add(c);
    }
}