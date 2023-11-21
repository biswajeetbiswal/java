import java.util.*;
class Bird
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,4,3,2,1,3,4};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
               int count=map.get(arr[i]);
               map.put(arr[i],++count);
               
            }
            else{
                map.put(arr[i],1);
            }
        }
        int max=0,value=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            if(max<e.getValue())
            {
                max=e.getValue();
                value=e.getKey();
            }
            else if(max==e.getValue())
            {
                if(value>e.getKey())
                {
                   value=e.getKey();
                }
            }
        }
        System.out.println(value);
    }
}