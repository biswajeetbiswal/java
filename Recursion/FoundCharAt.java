class FoundCharAt
{
     public static int first=-1;
     public static int last=-1;
    static void reverse(String s,int indx,char element)
    {
        if(indx==s.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char ch=s.charAt(indx);
        if(ch==element)
        {
            if(first==-1)
            {
                first=indx;
            }
            else
            {
                last=indx;
            }
        }
        reverse(s,indx+1,element);
    }
    public static void main(String args[])
    {
        String s="abcdef";
        reverse(s,0,'a');
    }
}