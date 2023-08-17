import java.util.*;
class PrintSumOfN
{
    int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        PrintSumOfN p=new PrintSumOfN();
        int x=p.sum(n);
        System.out.println(x);
    }
}