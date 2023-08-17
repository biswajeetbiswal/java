import java.util.*;
class Demo{
    Demo(int n)
    {
        int x=n;
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of a number is : "+fact);
    }
}
class Factorial
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int z=sc.nextInt();
        Demo d=new Demo(z); 
    }
}
