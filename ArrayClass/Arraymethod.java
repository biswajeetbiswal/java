import java.util.*;
class Arraymethod
{
    public static void main(String args[])
    {
        int arr[]={45,20,30,60,50,80,95};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //search an element from the array
        System.out.println(Arrays.binarySearch(arr,50));
        int arr1[]={45,20,30,60,50,80,95};
        if(Arrays.equals(arr1,arr))
        {
            System.out.println("Both array are same");
        }
        else
        {
            System.out.println("Both are not Same");
        }
        Arrays.fill(arr1,0  );
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+"\t");
        }        
    }
}