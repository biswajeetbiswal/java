import java.util.*;
class X
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<32;i++)
        {
            System.out.print("=");
        }
        System.out.println();
        for(int j=0;j<3;j++)
        {
            String s=sc.next();
            String s1=sc.next();
            int x=s.length();
            for(int i=0;i<(15-x);i++)
            {
                s=s.concat("_");
            }
            for(int i=0;i<(3-(s1.length()));i++)
            {
                s=s.concat("0");
            }
            s=s.concat(s1);
            System.out.println(s);
        }
    }
    
}