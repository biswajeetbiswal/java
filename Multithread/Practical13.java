import java.util.*;
class Demo extends Thread
{
    private int arr[];
    public Demo(int arr[])
    {
        this.arr=arr;
    }
    int low=0;
    int sum=0;
    public void run()
    {
        for(int number:arr)
        {
            sum+=number;
            if(number>low)
            {
                low=number;
            }
        }
        System.out.println("The largest number is:"+low);
        System.out.println("The sum of all number is:"+sum);
        Arrays.sort(arr);
        System.out.print("After sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
class Practical13
{
    public static void main(String args[])
    {
        int arr[]={5,6,70,25,15,30};
        Demo d=new Demo(arr);
        d.start();
    }
}