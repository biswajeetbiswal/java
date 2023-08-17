import java.util.*;

public class Transpose {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        m = sc.nextInt();
        System.out.println("Enter the no. of column:");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array elements are:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("After transpose:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + b[i][j]);
            }
            System.out.println("");
        }
    }
}
