import java.util.Scanner;

public class Traverse {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element:");
        n = sc.nextInt();
        int[] marks = new int[10];
        System.out.println("enter the numbers:");
        for (int i = 0; i < n; i++) {

            marks[i] = sc.nextInt();
            System.out.println("marks[" + i + "]=" + marks[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.println("marks[" + j + "]=" + marks[i]);
            }
        }
    }
}