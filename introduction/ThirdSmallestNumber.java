import java.util.*;

public class ThirdSmallestNumber {
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
        for (int j = 0; j < n - 1; j++) {
            for (int i = j; i < n; i++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After ascending:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.println("Third Smallest Number is:" + arr[2]);
    }
}
