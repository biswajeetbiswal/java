import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        int x, y, sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("the value of x is:");
        x = sc.nextInt();
        System.out.println("the value of y is:");
        y = sc.nextInt();
        sub = x - y;
        System.out.println("sub is:" + sub);
    }
}
