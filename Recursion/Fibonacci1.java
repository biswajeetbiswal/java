import java.util.*;
class Fibonacci1
{
    
    int show(int a,int b,int n)
    {
        if(n==2)
        {
            return 0;
        }
        else{
            int c=a+b;
            System.out.print(c+" ");
            a=b;b=c;
            return show(a,b,n-1);
        }
    }
    public static void main(String args[])
    {
        Fibonacci1 f=new Fibonacci1();
        System.out.print("0 1 ");
        f.show(0,1,15);
    }
}