class Commercial
{
    private String name;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void calculate(int units)
    {
        System.out.println("Customer: "+name);
        System.out.println("Bill amount= "+units*5.00);
    }
}
class Domestic extends Commercial{
    void calculate(int units)
    {
       System.out.println("Customer: "+getName());
        System.out.println("Bill amount= "+units*2.50); 
    }
}
class Polymerphism
{
    public static void main(String args [])
    {
        Commercial c=new Commercial();
        c.setName("Raju");
        c.calculate(100);
        Domestic d=new Domestic();
        d.setName("Hari");
        d.calculate(100);
    }
}