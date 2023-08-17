import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        int n, temp, rem, res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers:");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            res += rem * rem * rem;
            n = n / 10;
        }
        if (temp == res) {
            System.out.print("It is aarmstrong number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}