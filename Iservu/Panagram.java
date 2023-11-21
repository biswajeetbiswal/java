import java.util.*;
class Panagram
{
    public static void main(String args[])
    {
        String s="leetcode";
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        char arr[]=new char[set.size()];
        int j=0;
        for(char ch:set)
        {
            arr[j++]=ch;
        }
        Arrays.sort(arr);
        boolean b=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[0]!=97)
            {
                b=false;
                break;
            }
            if(arr[i]+1!=arr[i+1])
            {
                b=false;
                break;
            }
            // System.out.println(arr[i]);
        }
        System.out.println(b);
    }
}