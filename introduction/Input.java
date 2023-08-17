import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x:");
        x = sc.nextInt();
        System.out.println("enter the value of y:");
        y = sc.nextInt();
        sum = x + y;
        System.out.println("sum is:" + sum);

    }
}
