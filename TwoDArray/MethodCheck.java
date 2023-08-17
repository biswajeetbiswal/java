import java.util.*;
class MethodCheck{
    String name;
    int id;
    int display()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter name:");
        String n=sc.nextLine();
        System.out.print("Enter id:");
        int v=sc.nextInt();
        System.out.println(n+" "+v);
        return 0;
    }
    public static void main(String args[])
    {
        MethodCheck m=new MethodCheck();
         m.display(); 
    }
}