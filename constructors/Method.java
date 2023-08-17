import java.util.*;
class Method
{
    int x;
    void display()
    {
        int n=x;
        System.out.println("number "+n);
    }
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number");
        int a=sc.nextInt();
        Method m=new Method();
        m.x=a;
        m.display();
    }
}