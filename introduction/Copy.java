import java.util.*;

public class Copy {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = arr[i];
        }
        System.out.println("The new array is:");
        for (int i = 0; i < n; i++) {
            System.out.println("b[" + i + "]=" + b[i]);
        }
    }
}