import java.util.*;
class Prime
{
    Prime(int x,int y)
    {
        int count=0;
        for(int i=x;i<=y;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(i);
            }
            count=0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        Prime p=new Prime(a,b);
    }
}