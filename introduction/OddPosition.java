import java.util.*;

public class OddPosition {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.println("Print the odd position of element:");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println("arr[" + i + "]=" + arr[i]);
            }
        }
    }
}
