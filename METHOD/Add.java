import java.util.*;
class Add
{
    int arr[][];
    int m,n;
    Add(int m,int n)
    {
        this.m=m;
        this.n=n;
        arr=new int[m][n];
    }
    int [][]getmethod()
    {
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    int [][]findsum(int a[][],int b[][])
    {
        int temp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j]=a[i][j]+b[i][j];
            }
        }
        return temp;
    }
    void display(int res[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Add sd=new Add(3,3);
        Add sp=new Add(3,3);
        int x[][],y[][],z[][];
        System.out.println("Enter the first matrix element");
        x=sd.getmethod();
        System.out.println("Enter the second matrix element");
        y=sp.getmethod();
        z=sd.findsum(x,y);
        System.out.println("Sum is:");
        sp.display(z);
    }
}