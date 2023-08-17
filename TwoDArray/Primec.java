class Primec
{
    public static void main(String args[])
    {
       int j; 
        for(int i=5;i<=10;i++)
        {
           for( j=2;j<=i;j++)
           {

            if(i%j==0)
            {
             break;   
            }
           }
           if(i==j)
           {
            System.out.println(i);
           }
        }
        
    }
}