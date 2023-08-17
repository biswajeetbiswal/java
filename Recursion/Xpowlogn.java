import java.util.*;
class Xpowlogn
{
    int power(int x,int p)
    {
        if(x==0)
        {
            return 0;
        }
        if(p==0)
        {
            return 1;
        }
        if(p%2==0)
        {
            return power(x,p/2)*power(x,p/2);
        }
        else{
            return power(x,p/2)*power(x,p/2)*x;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println("Enter the power:");
        int p=sc.nextInt();
        Xpowlogn s=new Xpowlogn();
        int y=s.power(x,p);
        System.out.println(y);
    }
}