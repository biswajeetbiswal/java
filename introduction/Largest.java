import java.util.*;

public class Largest {
    public static void main(String args[]) {
        int n, temp;
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
        temp = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println("The largest element is:" + temp);
    }
}
