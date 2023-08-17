import java.io.*;
import java.util.*;
class Employee implements Serializable
{
    int id;
    String name;
    float sal;
    
    void display()
    {
        
        System.out.printf("%-10d %s %10.2f ",id,name,sal);
    }
    void getData()throws IOException

    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter emp.id:");
        id=Integer.parseInt(br.readLine());
        System.out.print("Enter name:");
        name=br.readLine();
        System.out.print("Enter Salary:");
        sal=Float.parseFloat(br.readLine());
    }
}
class Serialization
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       FileOutputStream fos=new FileOutputStream("objfile");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       System.out.print("How many employees?");
       int n=Integer.parseInt(br.readLine());
       for(int i=0;i<n;i++)
       {
        Employee e=new Employee();
        e.getData();
        oos.writeObject(e);
       }
       oos.close();
    }
}
