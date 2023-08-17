import java.util.*;

public class RightRotate {
    public static void main(String args[]) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        temp = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == arr[0]) {
                arr[0] = temp;
            } else {
                arr[i] = arr[i - 1];
            }
        }
        System.out.println("After right rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }

    }
}
