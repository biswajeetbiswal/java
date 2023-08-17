import java.io.*;
class Char_Stream
{
    public static void main(String args[])throws IOException
    {
        //file write
      /*  String str="This is a book on java";
        FileWriter fw=new FileWriter("text");
       for(int i=0;i<str.length();i++)
        {
            fw.write(str.charAt(i));
        }*/
        //file read
       FileReader fr=new FileReader("text");
       try{
        fr=new FileReader("text");
       }
       catch(FileNotFoundException fe)
       {
        System.out.println("File not found");
        return;
       }
       int ch;
       while((ch=fr.read())!=-1)
       System.out.print((char)ch);
        fr.close();
    }
}