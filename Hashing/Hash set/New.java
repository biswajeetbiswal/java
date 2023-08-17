import java.util.HashSet;
class New{
    public static void main(String args[])
    {
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};
        HashSet<Integer>h1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            h1.add(nums1[i]);
        }
        HashSet<Integer>h2=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            h2.add(nums2[i]);
        }
        HashSet<Integer>h3=new HashSet<>();
        for(Integer var:h1)
        {
            if(h2.contains(var))
            {
                h3.add(var);
            }
        }
        int arr[]=new int[h3.size()];
        int j=0;
        for(Integer val:h3)
        {
            arr[j]=val.intValue();
            j++;
        }
       /* Integer arr[]=new Integer[h3.size()];
        arr=h3.toArray(arr);*/
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}