import java.util.*;
class Factorial
{
    int add(int n)
    {
        
        if(n==1||n==0)
        {
            return 1;
        }
        //int sum=add(n-1);
        //int sumN=sum*n;
        return n*add(n-1);
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter last number:");
        int y=sc.nextInt();
        Factorial ns=new Factorial();
        int d=ns.add(y);
        System.out.println(d);
    }
}