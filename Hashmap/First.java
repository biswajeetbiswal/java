import java.util.*;
class First
{
    public static void main(String args[])
    {
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("Ram",25);
        hs.put("Hari",65);
        hs.put("John",85);
        hs.put("Due",60);
        hs.put("Ram",25);
        //unorder list
        System.out.println(hs);
        System.out.println(hs.get("Ram"));
        if(hs.containsKey("Ram"))
        {
            System.out.println("Key is present");
        }
        else{
            System.out.println("key is not present");
        }
        System.out.println(hs.get("Biswa"));
        System.out.println(hs.size());
        for(Map.Entry<String,Integer> e:hs.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        hs.remove("Hari");
        System.out.println(hs);
       /* Set<String> set =new HashSet<String>();
        set = hs.KeySet();
        System.out.println(set); */
        System.out.println(hs.values());
    }
}