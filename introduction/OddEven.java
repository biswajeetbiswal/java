import java.util.*;

public class OddEven {
    public static void main(String args[]) {
        int n;
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
        System.out.print("The even number are:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(+arr[i]);
            }
        }
        System.out.print("The odd number are:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(+arr[i]);
            }
        }
    }
}
