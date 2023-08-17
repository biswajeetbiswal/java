import java.util.*;
class Method{
    String name;
    int area(int x)
    {
        return(x*x);
    }
    int a;
    void display(int x){
        a=x;
    }
    void demo()
    {
        System.out.println("a = "+a);
    }

    public static void main(String args[])
    {
        Method m=new Method();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side:");
        int a=sc.nextInt();
        System.out.println("The area is = "+m.area(a));
        m.name="Biswajeet";
        System.out.println("My name is "+m.name);
        m.display(3);
        m.demo();
    }
}
