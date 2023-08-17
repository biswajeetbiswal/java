import java.util.*;
class Insertion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position where you want to insert:");
        int x=sc.nextInt();
        System.out.println("Enter the number you want to insert:");
        int y=sc.nextInt();
       // int arr1[]=new int[n+1];
        for(int i=n-2;i>=x;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[x]=y;
        for(int i=0;i<n;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}