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
}
class Desealization
{
    public static void main(String args[])throws IOException
    {
       FileInputStream fis=new FileInputStream("objfile");
       ObjectInputStream ois=new ObjectInputStream(fis);
       Employee e;
       while((e=(Employee) ois.readObject())!=null)
       e.display();
       ois.close();
    }
}