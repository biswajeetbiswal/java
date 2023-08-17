import java.util.*;

public class CheakSameOrNot {
    public static void main(String args[]) {
        int m, n;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        m = sc.nextInt();
        System.out.println("Enter the no. of columns:");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        System.out.println("Enter the first array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second array elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Check the two array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {

                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("same");

        } else {
            System.out.println("not same");
        }
    }
}