import java.util.Scanner;

public class Linear {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        System.out.println("enter value of x:");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("x found at index:" + i);
            }
        }
    }
}
