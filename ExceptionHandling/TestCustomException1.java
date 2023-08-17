class InvalidException  extends Exception  
{  
    public InvalidException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
// class that uses custom exception InvalidException  
public class TestCustomException1  
{  
  
    // method to check the age  
    static void validate (int age) throws InvalidException{    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new InvalidException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
            // calling the method   
            validate(13);  
        }  
        catch (InvalidException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
} 