import java.util.*;

public class Patern {
    public static void main(String args[]) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
