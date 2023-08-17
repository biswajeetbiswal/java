import java.util.*;
class Area
{
    int p,q;
    Area(int a,int b)
    {
         p=a;
         q=b;
    }
    int cal()
        {
            int area;
            area=p*q;
            return area;
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the rectangle:");
        int x=sc.nextInt();
        System.out.print("Enter breadth of the rectangle:");
        int y=sc.nextInt();
        Area ar=new Area(x,y);
        int s=ar.cal();
        System.out.println("The area of the rectangle is "+s);
    }
}