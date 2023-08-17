import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      int a = 0, b = 1, n, c;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no. terms:");
      n = sc.nextInt();
      while (n > 0) {
         c = a + b;
         a = b;
         b = c;
         n--;
      }
      System.out.println("Fibonacci is:" + b);
   }
}
