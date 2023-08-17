import java.util.*;
class Method
{
    public static void main(String args[])
    {
        String s="Today,i am unable take your class";
        StringTokenizer st=new StringTokenizer(s," ,");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        
    }
}