import java.util.*;
class NaturalSum
{
    int add(int n)
    {
        
        if(n==1)
        {
            return 1;
        }
        int sum=add(n-1);
        int sumN=sum+n;
        return sumN;
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter last number:");
        int y=sc.nextInt();
        NaturalSum ns=new NaturalSum();
         int d=ns.add(y);
         System.out.println(d);
    }
}