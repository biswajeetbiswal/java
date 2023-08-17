import java.util.*;
class First
{
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=5;i++)
        {
            q.offer(i);
        }
        System.out.println("The queue is:"+q);
      /* while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }*/
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.size());
    }
}