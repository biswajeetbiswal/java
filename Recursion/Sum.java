import java.util.*;
class Sum{
    static void recur(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        recur(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        recur(n);
    }
}