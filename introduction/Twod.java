import java.util.Scanner;

public class Twod {
    public static void main(String args[]) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size:");
        m = sc.nextInt();
        System.out.println("enter the column size:");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("enter the elements of array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
            }
        }

    }
}
