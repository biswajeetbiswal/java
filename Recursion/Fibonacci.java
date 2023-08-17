import java.util.*;
class Fibonacci{
    int a=0,b=1;
    void display(int n)
    {
        if(n==2)
        {
            return;
        }
        int c=a+b;
        a=b;
        b=c;
        System.out.println(c);
        display(n-1);
    }
    public static void main(String args[])
    {
       
        Fibonacci f=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number terms:");
        int x=sc.nextInt();
        System.out.println("Fibonacci sequence is:");
        System.out.println("0");
        System.out.println("1");
        f.display(x);
    }
}