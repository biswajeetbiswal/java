import java.util.HashSet;
import java.util.Iterator;
class Method
{
    public static void main(String args[])
    {
        HashSet<Integer> hash=new HashSet<>();
        hash.add(5);
        hash.add(6);
        hash.add(8);
        hash.add(8);
        hash.add(25);
        hash.add(30);
        hash.add(45);
        hash.add(1);
        hash.add(500);
        //print
        System.out.println(hash);
        //size
        System.out.println("Size of hashset:"+hash.size());
        //search-contains
        if(hash.contains(25))
        {
            System.out.println("hash contains 25");
        }
        if(!hash.contains(100))
        {
            System.out.println("Hash does not contain 100");
        }
        //delete
        hash.remove(25);
        System.out.println(hash);
        //iterator
        Iterator it=hash.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //remove all element from the hashset
        hash.clear();
        System.out.println(hash);
        //check hash is empty or not 
        if(hash.isEmpty())
        {
            System.out.println("Yes hash is empty");
        }
        
    }
}