import java.util.*;

public class Left {
    public static void main(String args[]) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n - 1]) {
                arr[n - 1] = temp;
            } else {
                arr[i] = arr[i + 1];
            }

        }
        System.out.println("After left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
}
