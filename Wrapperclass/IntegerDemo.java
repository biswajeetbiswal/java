import java.util.*;
class IntegerDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        String s=sc.next();
        Integer obj=new Integer(s);
        String s1=obj.toString();
        System.out.println(s1);
        int i=Integer.parseInt(s1);
        String s2=obj.toBinaryString(i);
        System.out.println(s2);
        String s3=obj.toOctalString(i);
        System.out.println(s3);
        String s4=obj.toHexString(i);
        System.out.println(s4);

    }
}