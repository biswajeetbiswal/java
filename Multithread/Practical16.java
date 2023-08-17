import java.io.*;
 class Student implements Serializable
{
    int id;
    String name;
    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class Practical16
{
    public static void main(String args[])
    {
        try{
            Student s1=new Student(211,"Ravi");
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try{
            FileInputStream fin=new FileInputStream("f.txt");
            ObjectInputStream in=new ObjectInputStream(fin);
            Student s=(Student)in.readObject();
            System.out.println("Student id is " +s.id+" "+" Student name is "+s.name);
            in.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}