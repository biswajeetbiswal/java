class Sample
{
    static double sum(double num1,double num2)
    {
        double res=num1+num2;
        return res;
    }
    public static void main(String args[])
    {
        double x=Sample.sum(10,22.5);
        System.out.println("Sum is = "+x);
    }
}