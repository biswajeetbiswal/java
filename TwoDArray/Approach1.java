import java.util.*;

public class Approach1 {
    int a, b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = sc.nextInt();
        System.out.println("Enter the value of b:");
        b = sc.nextInt();
    }

    void putdata() {
        System.out.println("Addition:" + (a + b));
    }

    public static void main(String args[]) {
        Approach1 x = new Approach1();
        x.getdata();
        x.putdata();
    }
}
