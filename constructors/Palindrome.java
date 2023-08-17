import java.util.*;
class Palindrome
{
    int x;
    int fact=1;
    Palindrome()
    {
       //Here dont access the value of "x" because the value of "x" assign using constructor object
       for(int i=1;i<=x;i++)
       {
        fact=fact*i;
       }
       System.out.println("Factorial is: "+fact);
    }
    void display()
    {
        //here the value of "x" we used because it is a method it calls from  class object
        System.out.println("sum is "+x);
    }
    Palindrome(int a)
    {
        x=a;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of a number is: "+fact);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int z=sc.nextInt();
        Palindrome r=new Palindrome(z);
        Palindrome p=new Palindrome();

        r.display();
    }
}