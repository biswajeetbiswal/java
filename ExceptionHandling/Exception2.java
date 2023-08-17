import java.util.*;
class Exception2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            int a=40/n;
            System.out.println("a="+a);
            int arr[]={35,30,20};
            arr[50]=40; 
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
            System.out.println("Arithmetic error occur");
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println(aie);
            aie.printStackTrace();
            System.out.println("Array index exception");
        }
        finally
        {
            System.out.println("closed file");
        }

    }
}