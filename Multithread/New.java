// class Rectangle
// {
//     void area(int a,int b)
//     {
//         System.out.println(a*b);
//     }
// }
// class Square extends Rectangle
// {
//     void area(int a,int b,int c)
//     {
//         super.area(a,b);
//         System.out.println(c*c);
//     }
// }
// class Demo extends Square
// {
//     void area(int a,int b,int c)
//     {
//         super.area(a,b,c);
//         System.out.println(a+b+c);
//     }
// }
// class New
// {
//     public static void main(String args[])
//     {
//         Demo s=new Demo();
//         s.area(3,4,5);
//     }
// }



// class A{
//     A()
//     {
//         System.out.println("Hello");
//     }
// }
// class B extends A{
//     B()
//     {
//     //super(); If we dont write super it also call the super class constructor
//         System.out.println("dnvj");
//     }
// }
// class New{
//     public static void main(String args[])
//     {
        
//         B b=new B();

//     }
// }



// interface A{
//     void area();
// }
// interface B{
//     void perimeter();
// }
// class Demo implements A,B{
//     int a,b;
//     void show(int a,int b)
//     {
//         this.a=a;
//         this.b=b;
//     }
//     public void area()
//     {
//         System.out.println(a*b);
//     }
//     public void perimeter()
//     {
//         System.out.println(2*(a+b));
//     }
// }
// class New{
//     public static void main(String args[])
//     {
//         Demo d=new Demo();
//         d.show(4,3);
//         d.area();
//         d.perimeter();
//     }
// }



public class New {   
    //function to check if person is eligible to vote or not   
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validate(13);  
        System.out.println("rest of the code...");    
  }    
}    