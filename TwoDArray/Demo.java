import java.util.*;

class Approach2 {
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
}

class Demo {
    public static void main(String args[]) {
        Approach2 x = new Approach2();
        x.getdata();
        x.putdata();
    }
}
