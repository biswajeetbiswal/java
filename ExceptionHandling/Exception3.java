import java.util.*;
class Exception3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int a=40/n;
            System.out.println("a="+a);
            int arr[]={35,30,20};
            arr[50]=40;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }
        finally
        {
            System.out.println("closed file");
        }
    }
}