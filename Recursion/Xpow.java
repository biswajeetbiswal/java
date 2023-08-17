import java.util.*;
class Xpow
{
    int power(int x,int p)
    {
        if(x==0)
        {
            return 0;
        }
        else if(p==0)
        {
            return 1;
        }
        else{
            return x*power(x,p-1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        System.out.println("Enter the power:");
        int p=sc.nextInt();
        Xpow s=new Xpow();
        int y=s.power(x,p);
        System.out.println(y);
    }
}