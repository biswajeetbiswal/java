import java.util.*;
class Methodoverloading
{
    int area(int a)
    {
        int square=a*a;
        return square;
    }
    int area(int x,int y)
    {
        int rect=x*y;
        return rect;
    }
    float area(float r){
        float cr=(22/7)*r*r;
        return cr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of the square:");
        int s=sc.nextInt();
        System.out.print("Enter thr length of the Rectangle:");
        int l=sc.nextInt();
        System.out.print("Enter the breadth of the Rectangle:");
        int b=sc.nextInt();
        System.out.print("Enter the radius of the circle:");
        float c=sc.nextFloat();
        Methodoverloading m=new Methodoverloading();
        int sq=m.area(s);
        int re=m.area(l,b);
        System.out.println("The area of the square is "+sq);
        System.out.println("The area of the rectangle is "+re);
        System.out.print("The area of the circle is "+m.area(c));
    }
}