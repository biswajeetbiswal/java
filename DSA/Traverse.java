import java.util.*;
class Traverse
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Traverse the array element:");
        for(int i=0;i<n;i++)
        {
            System.out.println("arr["+i+"]= "+arr[i]);
        }
    }
}