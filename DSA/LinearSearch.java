import java.util.*;
class LinearSearch
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
        System.out.print("Enter the number that you want to search:");
        int m=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                System.out.print(m+" Found on index of "+i+".");
            }
            else{
                count++;
            }
        }
        if(count==n)
        {
            System.out.print("There is no same element in the array");
        }
    }
}