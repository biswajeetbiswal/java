import java.util.*;
class Sorting
{
    int []sort(int n)
    {
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[n];
        System.out.print("The array element are:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        Sorting s=new Sorting();
        int a[];
        a=s.sort(n);
        for(int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]= "+a[i]);
        }
    }
}