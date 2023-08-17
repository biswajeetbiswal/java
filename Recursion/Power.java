import java.util.*;
class Power
{
    int display(int x,int b)
    {
        if(x==0)
        {
            return 0;
        }
        if(b==0)
        {
            return 1;
        }
        int mul=display(x,b-1);
        int total=x*mul;
        return total;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number:");
        int y=sc.nextInt();
        System.out.print("Enter the power:");
        int z=sc.nextInt();
        Power p= new Power();
        int w=p.display(y,z);
        System.out.println(y+" power "+z+" is "+w);
    }
}