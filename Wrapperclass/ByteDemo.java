import java.util.*;
class ByteDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a byte number:");
        String s1=sc.next();
        Byte b1=new Byte(s1);
        System.out.println("Enter a byte number:");
        String s2=sc.next();
        Byte b2=new Byte(s2);
        int n=b1.compareTo(b2);
        if(n==0)
        {
            System.out.println("Both bytes are same");
        }
        else if(n<0)
        {
            System.out.println(b1+" is less");
        }
        else{
            System.out.println(b2+"is less");
        }
    }
}