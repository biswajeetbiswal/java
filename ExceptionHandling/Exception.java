import java.util.*;
class Exception
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int a=35/n;
            System.out.println("a= "+a);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
            System.out.println("There is some error occur");
        }
        finally
        {
            System.out.println("Closed file");
        }
    }
}