import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Find
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        //add element
        System.out.println("Enter number");
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            list.add(n);
        }
        Collections.sort(list);
        for(int i=4;i>=0;i--)
        {
            if(list.get(i)!=list.get(i-1))
            {
                System.out.println(list.get(i-1));
                break;
            }
        }
    }
}