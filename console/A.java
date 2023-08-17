import java.io.*;
class A
{
    public static void main(String args[])
    {
        String str;
        char ch[];
        Console obj=System.console();
        System.out.println("Enter username");
        str=obj.readLine();
        System.out.println("Enter password");
        ch=obj.readPassword();
       // String a=String.valueOf(ch);

        System.out.println("Username:"+str);
        System.out.println("password:"+ch);
        //System.out.println("Password:"+a);
    }
}