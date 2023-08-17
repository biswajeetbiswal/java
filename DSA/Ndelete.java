import java.util.*;
class Ndelete
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of element:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position where you want to delete:");
        int x=sc.nextInt();
        for(int i=x;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
         for(int i=0;i<n-1;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}