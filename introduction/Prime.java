import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("the no. is a prime number");
        } else {
            System.out.println("the no. is not a prime number");
        }
    }

}
