import java.util.*;
import java.text.*;
class Method{
    public static void main(String args[])
    {
        Date d=new Date();
        DateFormat fmt =DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM,Locale.UK);
        String s=fmt.format(d);
        System.out.println(s);
    }
}