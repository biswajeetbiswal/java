import java.util.*;
class Demo
{
    int id;
    String name;
    String address;
    Demo(int i,String n,String a)
    {
        id=i;
        name=n;
        address=a;
    }
    void displa()
    {
        System.out.println("id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);

    }
}
class Display{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        String address;
        ArrayList<Demo> arl=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Id:");
            id=sc.nextInt();
            System.out.println("Enter name:");
            name=sc.next();
            System.out.println("Enter address:");
            address=sc.next();
            Demo obj=new Demo(id,name,address);
            arl.add(obj);

        }
        System.out.println("Enter id to search:");
        id=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arl.size();i++)
        {
            Demo obj=arl.get(i);
            if(id==obj.id)
            {
                obj.displa();
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("Employee not found");
        }

    }
}
