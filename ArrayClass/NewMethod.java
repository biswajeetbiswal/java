import java.util.*;
class NewMethod
{
    public static void main(String args[])
    {
        int arr[]={45,20,10,90,5};
        int arr2[]={45,20,10,90,5};
       // Sort the array
       Arrays.sort(arr2);
        Arrays.sort(arr);
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

         //Sort array in a given interval
         /* Arrays.sort(arr,0,3);
           for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }*/
        System.out.println();

        //search an element using binary search
        System.out.println("45 found at index= "+Arrays.binarySearch(arr,45));
        //check two array same or not
        if(Arrays.equals(arr,arr2))
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Both are not same");
        }

        //to string
        System.out.println("Integer Array:"+Arrays.toString(arr));
        //copyOf
        System.out.println("Integer array:"+Arrays.toString(Arrays.copyOf(arr,10)));`
        //change all element in the array
        Arrays.fill(arr,5);
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}