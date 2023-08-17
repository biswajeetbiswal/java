import java.util.*;
class Demo
{
   int []ar()
   {
        ArrayList<Integer>ar=new ArrayList<>();
        ar.add(45);
        ar.add(865);
        ar.add(90);
        ar.add(50);
        ar.add(10);
        /*Integer arr[]=new Integer[ar.size()];
        arr=ar.toArray(arr);*/
        int arr[]=new int[ar.size()];
         int i=0;
        for(Integer cur:ar)
        {
            arr[i]=cur.intValue();
            i++;
        }
        return arr;
   }
   
        
}
class For_eachLoop
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        int arr[]=d.ar();
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }

}