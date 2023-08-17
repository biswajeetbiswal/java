import java.util.*;
class Recursion
{
    int display(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int factNm1=display(n-1);
        int FactN=factNm1*n;
        return FactN;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        Recursion r=new Recursion();
        int y=r.display(x);
        System.out.println(y);
    }
}