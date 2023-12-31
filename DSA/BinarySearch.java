import java.util.*;
class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements:");
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
        System.out.print("Enter the number that you want to search:");
        int data=sc.nextInt();
        int low=0;
        int high=n-1;
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
            System.out.println("Found at position "+mid);
        }
        else{
            System.out.println("Not found");
        }
    }
}