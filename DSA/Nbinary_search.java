import java.util.*;
class Nbinary_search
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
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        /* for(int i=0;i<n;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }*/
        System.out.print("Enter the number that you want to search:");
        int data=sc.nextInt();
        int low=0,high=n-1;
        int mid=0,flag=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==data)
            {
                flag++;
                break;
            }
            else if(arr[mid]>data)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(flag==1)
        {
            System.out.println(data+" found at position "+mid);
        }
        else{
            System.out.println("Not found");
        }
    }
}