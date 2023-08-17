import java.util.*;
class Palindrome
{
    int check(int n)
    {
        int x;
        int sum=0;
        while(n>0)
        {
            x=n%10;
            sum=(10*sum)+x;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int y=sc.nextInt();
        Palindrome p=new Palindrome();
       int a= p.check(y);
       if(a==y)
       {
        System.out.println("It is a palindrome number");
       }
       else
       {
        System.out.println("It is not a palindrome number");
       }
    }
}