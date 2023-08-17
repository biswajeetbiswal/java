import java.util.*;
class Linked{
    public static void main(String args[])
    {
        LinkedList<Integer> li=new LinkedList<>();
        //boolean add
        if(li.add(354))
        {
            System.out.println("Successfully added");
        }
        //add
        li.add(45);
        li.add(65);
        //add at a specific position
        li.add(0,75);
        //add at first index
        li.addFirst(90);
        li.add(25);
        li.add(25);
        //add lats indexs
        li.addLast(85);
        System.out.println(li);
        //remove first element
        li.removeFirst();
        System.out.println(li);

        //remove last elemwnt
        li.removeLast();
        System.out.println(li);
    
        //remove element at aposition
        li.remove(2);
        System.out.println(li);
        //get position
        System.out.println(li.get(2));
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        //replace an eleement
        li.set(2,20);
        System.out.println(li);
        //size
        System.out.println(li.size());
        System.out.println(li.indexOf(25));
       // System.out.println(li.toArray());
    }
}