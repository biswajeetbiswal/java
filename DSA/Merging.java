import java.util.*;
class Merging
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first array size:");
       int m=sc.nextInt();
       System.out.print("Enter the second array size:");
       int n=sc.nextInt();
       int arr1[]=new int[m];
       int arr2[]=new int[n];
       System.out.print("Enter first array element:");
       for(int i=0;i<m;i++)
       {
        arr1[i]=sc.nextInt();
       } 
       System.out.print("Enter second array element:");
       for(int i=0;i<n;i++)
       {
        arr2[i]=sc.nextInt();
       } 
       int s=m+n;
       int arr3[]=new int[s];
       for(int i=0;i<m;i++)
       {
        arr3[i]=arr1[i];
       }
       int j=0;
       for(int i=m;i<s;i++)
       {
        arr3[i]=arr2[j];
        j++;
       }
       for(int i=0;i<s;i++)
        {
            System.out.println("arr3["+i+"]= "+arr3[i]);
        }
    }
}