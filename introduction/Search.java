import java.util.*;

public class Search {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows:");
        m = sc.nextInt();
        System.out.println("enter the column size:");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
            }
        }
        System.out.println("enter the value of x:");
        int x = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == x) {
                    System.out.println("x found at index:(" + i + "," + j + ")");
                }
            }
        }
    }

}
