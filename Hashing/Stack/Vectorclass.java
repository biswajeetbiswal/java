import java.util.Vector;
import java.util.*;
class Vectorclass
{
    public static void main(String args[])
    {
        Vector<Integer> v=new Vector<>();
        v.add(45);
        v.add(60);
        v.add(2,50);
        v.add(65);
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
        //v.remove(65);
        v.clear();
        System.out.println(v);
        v.add(30);
        v.add(90);
        v.add(50);
        v.add(85);
        v.set(2,100);
        System.out.println(v);
        System.out.println(v.get(0));
        System.out.println(v.indexOf(85));
        System.out.println(v.size());
        System.out.println("print all elemeents sequencially");
        ListIterator v1=v.listIterator();
        while(v1.hasNext())
        {
            System.out.print(v1.next()+"\t");
        }
        System.out.println("\nprint all elements reverse order");
        while(v1.hasPrevious())
        {
            System.out.print(v1.previous()+"\t");
        }
    }
}