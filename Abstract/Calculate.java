abstract class Plan
{
    //instance variable
     double rate;
     //abstract method
    abstract void getRate();
    //concrete method
    void calculateBill(int units)
    {
        System.out.println("Bill amount for "+units+" units");
        System.out.println(rate*units);
    }
}
class CommercialPlan extends Plan
{
    void getRate()
    {
        rate=5;
    }
}
class Domesticplan extends Plan
{
    void getRate()
    {
        rate=2.60;
    }
}
class Calculate{
    public static void main(String args[])
    {
        Plan p;
        p=new CommercialPlan();
        p.getRate();
        p.calculateBill(250);


        p=new Domesticplan();
        p.getRate();
        p.calculateBill(150);
    }
}