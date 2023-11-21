class Sqrt
{
    public static void main(String args[])
    {
        int x=Integer.parseInt(args[0]);
        double f=(double)Math.pow(x,0.5);
        //print double precision value
        System.out.format("%.2f",f);
    }
}