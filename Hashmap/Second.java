import java.util.*;
class Second
{
    public static void main(String args[])
    {
        Hashtable<String,Integer>ht=new Hashtable<>();
        ht.put("Biswa",22);
        ht.put("Raj",25);
        ht.put("Suman",35);
        System.out.println(ht);
        System.out.println(ht.get("Biswa"));
        ht.remove("Suman");
        System.out.println(ht);
        System.out.println(ht.size());
    }
}