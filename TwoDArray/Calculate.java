import java.util.*;

public class Calculate {
    public static void main(String args[]) {
        int m, n, x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        m = sc.nextInt();
        System.out.println("Enter the no. of column:");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter the first array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 0) {
                    x++;
                } else {
                    y++;
                }
            }
        }
        System.out.println("Total no. of even number is: " + x);
        System.out.println("Total no. of odd number is:" + y);
    }
}
