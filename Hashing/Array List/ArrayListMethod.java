import java.util.ArrayList;
import java.util.Collections;
class ArrayListMethod
{
    public static void main(String args[])
    {
        //Declaration of Arrayalist
        ArrayList<Integer> list=new ArrayList<>();
        //add elements
        list.add(15);
        list.add(17);
        list.add(25);
        list.add(35);
        System.out.println(list);
        //get elements
       int a1= list.get(0);
       System.out.println(a1);
       //add a element in a particular position
       list.add(1,20);
       System.out.println(list);
       //add a element in a particular position where a element already exit
       list.set(1,50);
       System.out.println(list);
       //delete element
       list.remove(3);
       System.out.println(list);
       //size of the list
       int x=list.size();
       System.out.println(x);
       //loops
       for(int i=0;i<list.size();i++)
       {
        System.out.println(list.get(i));
       }
       //sorting
       Collections.sort(list);
       System.out.println(list);
    }
}