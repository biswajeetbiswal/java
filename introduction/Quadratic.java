import java.util.*;
class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of 'a':");
        int a=sc.nextInt();
        System.out.println("Enter the value of 'b':");
        int b=sc.nextInt();
        System.out.println("Enter the value of 'c':");
        int c=sc.nextInt();
        double d=b*b-4*a*c;
        if(d>0)
        {
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are: "+r1+" "+r2);
        }
        else if(d==0)
        {
            double r3=-b/(2*a);
            System.out.println("The root is: "+r3);
        }
        else
        {
            System.out.println("Roots are not real");
        }
    }
}