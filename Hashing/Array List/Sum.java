import java.util.ArrayList;
import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        //add element
        System.out.println("Enter elements:");
        int sum=0;
        for(int i=0;i<10;i++)
        {
            int n=sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        System.out.println(sum);

    }
}