import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r, s = 0, temp, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. to check:");
        x = sc.nextInt();
        temp = x;
        while (x > 0) {
            r = x % 10;
            s = (s * 10) + r;
            x = x / 10;

        }
        if (temp == s) {
            System.out.println("the given no. is palindrome");

        } else {
            System.out.println("the given no. is not palindrome");

        }
    }
}
