import java.io.*;
class BufferOutput
{
    public static void main(String args[])throws IOException
    {
        //Read data from keyboard
        DataInputStream dis=new DataInputStream(System.in);
        //attach file
        FileOutputStream fout=new FileOutputStream("myfile.txt",true);
        BufferedOutputStream bout =new BufferedOutputStream(fout,1024);
        System.out.println("Enter text @ at the end");
        char ch;
        while((ch=(char)dis.read())!='@')
        bout.write(ch);
        bout.close();

    }
}