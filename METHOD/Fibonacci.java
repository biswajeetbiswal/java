import java.util.*;
class Fibonacci
{
    int []check(int n)
    {
        int a=0,b=1;
        int c;
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            arr[i]=c;
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int x=sc.nextInt();
        Fibonacci f=new Fibonacci();
        int a[];
        a=f.check(x);
        for(int i=0;i<x;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}