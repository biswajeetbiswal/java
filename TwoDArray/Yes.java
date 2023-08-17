import java.util.*;

public class Yes {
    public static void main(String args[]) {
        int m, n, x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        m = sc.nextInt();
        System.out.println("Enter the no. of column:");
        n = sc.nextInt();
        int y = m * n;
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        System.out.println("Enter the first array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == b[i][j]) {
                    x++;
                }
            }
        }
        if (x == y) {
            System.out.println("Two matrices are equal.");
        } else {
            System.out.println("Two matrices are not equal.");
        }
    }
}
