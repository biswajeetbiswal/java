import java.util.ArrayList;
class New{
    public static void main(String arsg[])
    {
        ArrayList<Integer>ar=new ArrayList<>();
        ar.add(45);
        ar.add(865);
        ar.add(90);
        ar.add(50);
        ar.add(10);
        //converting arraylist to array
        /*int arr[]=new int[ar.size()];
         int i=0;
        for(Integer cur:ar)
        {
            arr[i]=cur.intValue();
            i++;
        }
        for(int val:arr)
        {
            System.out.print(val+" ");
        }*/
        Integer arr[]=new Integer[ar.size()];
        arr=ar.toArray(arr);
        for(Integer   val:arr)
        {
            System.out.print(val+" ");
        } 
    }
}