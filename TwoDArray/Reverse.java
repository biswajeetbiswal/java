import java.util.*;

class Reverse {
    int n;

    void getdata(int i) {
        n = i;
    }

    void putdata() {
        int x, rev = 0;
        while (n > 0) {
            x = n % 10;
            rev = (rev * 10) + x;
            n = n / 10;

        }
        System.out.println("Reverse=" + rev);

    }

    public static void main(String args[]) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m:");
        m = sc.nextInt();
        Reverse x = new Reverse();
        x.getdata(m);
        x.putdata();
    }

}