import java.util.*;

public class RemoveDuplicate {
    public static void main(String args[]) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.println("the duplicate element are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(+arr[i]);
                    arr[i] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
}
