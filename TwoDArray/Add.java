import java.util.*;

public class Add {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns:");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int sum[][] = new int[m][n];
        System.out.println("Enter the first array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("After addition:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("sum[" + i + "][" + j + "]=" + sum[i][j]);
            }
        }

    }
}
