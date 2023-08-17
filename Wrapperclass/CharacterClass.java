import java.util.*;
class CharacterClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a character:");
            char ch=sc.next().charAt(0);
            System.out.println("You entered:");
            if(Character.isDigit(ch))
            {
                System.out.println("a digit");
            }
            else if(Character.isUpperCase(ch))
            {
              System.out.println("an uppercase letter");  
            }
            else if(Character.isLowerCase(ch))
            {
                System.out.println("an lowercase letter");
            }
            else if(Character.isSpaceChar(ch))
            {
                System.out.println("a spacebar character");
            }
            else if(Character.isWhitespace(ch))
            {
                System.out.println("a whitespace character");
                return;
            }
            else
            {
                System.out.println("Sorry,i dont know that");
                break;
            }
        }
    }
}