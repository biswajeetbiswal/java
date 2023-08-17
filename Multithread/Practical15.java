import java.io.*;
class Practical15
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout =new FileOutputStream("myfile.txt");
        System.out.println("Enter text @ at the end:");
        char ch;
        while((ch=(char)dis.read())!='@')
        {
            fout.write(ch);
        }
        fout.close();
        FileInputStream fin=new FileInputStream("myfile.txt");
        System.out.println("File contents:");
        int c;
        while((c=fin.read())!=-1)
        {
            System.out.print((char)c);
        }
        fin.close();
    }
}