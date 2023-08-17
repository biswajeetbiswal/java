class ReverseString
{
     static void reverse(String s,int indx)
    {
        if(indx==0)
        {
            System.out.print(s.charAt(indx));
            return;
        }
        System.out.print(s.charAt(indx));
        reverse(s,indx-1);
    }
    public static void main(String args[])
    {
        String s1="abcd";
        reverse(s1,s1.length()-1);
    }
}