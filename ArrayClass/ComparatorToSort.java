import java.util.*;
/*class Ascend implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        return i1.compareTo(i2);
    }
}
class Descend implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        return i2.compareTo(i1);
    }
}*/
class ComparatorToSort
{
    public static void main(String args[])
    {
        Integer arr[]={20,60,45,95,30,50,52};
        Arrays.sort(arr,new Ascend());
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Arrays.sort(arr,new Descend());
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}