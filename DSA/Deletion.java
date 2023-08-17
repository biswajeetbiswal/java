import java.util.*;
class Deletion
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("How many elements are you want to delete? :");
        int x=sc.nextInt();
        int s=n-x;
        int res[]=new int[s];
        int p[]=new int[x];
        for(int i=0;i<x;i++)
        {
            System.out.print("Enter the position of "+"'"+(i+1)+"'"+" element that to be deleted:");
            p[i]=sc.nextInt();
        }
        for(int i=0;i<x-1;i++)
        {
            for(int j=i+1;i<x;i++)
            {
                if(p[i]>p[j])
                {
                    int temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            int g=p[i];
            arr[g]=0;
        }
        for(int i=x-1;i>=0;i--)
        {
            int t=p[i];
            for(int j=t;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
        }
        for(int i=0;i<s;i++)
        {
            res[i]=arr[i];
        }
        for(int i=0;i<s;i++)
        {
            System.out.println("res["+i+"]= "+res[i]);
        }
    }
}