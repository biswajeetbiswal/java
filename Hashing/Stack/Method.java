import java.util.Stack;
class Method
{
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<>();
        st.push(35);
        st.push(40);
        st.push(70);
        st.push(100);
        st.push(150);
        //print
        System.out.println(st);
        //delete
        st.pop();
        System.out.println(st);
        //delete and return
        Integer obj=st.pop();
        System.out.println(obj);
        //peek a element of the top of the stack
        System.out.println(st.peek());
        //check it is empty or not
        if(!st.empty())
        {
            System.out.println("Stack is not empty");
        }
        //it found a position of an element
        System.out.println(st.search(55));
    }
}