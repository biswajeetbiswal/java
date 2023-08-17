import java.io.*;
class FileInput
{
    public static void main(String args[])throws IOException
    {
        //Attach keyboard
        DataInputStream dis =new DataInputStream(System.in);
        //Attach file
        FileOutputStream fout=new FileOutputStream("myfile.txt",true);
        System.out.println("enter text @ at the end:");
        char ch;
        while((ch=(char)dis.read())!='@')
        fout.write(ch);

        // for output
        FileInputStream fin=new FileInputStream("myfile.txt");
        int x;
        while((x=fin.read())!=-1)
        System.out.print((char)x);      
        fout.close();
    }
}
