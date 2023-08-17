import java.util.*;

class Return {
    int n;

    void getdata(int i) {
        n = i;
    }

    int putdata() {
        int x, rev = 0;
        while (n > 0) {
            x = n % 10;
            rev = (rev * 10) + x;
            n = n / 10;
        }
        return (rev);
    }

    public static void main(String args[]) {
        int y, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m:");
        m = sc.nextInt();
        Return x = new Return();
        x.getdata(m);
        y = x.putdata();
        System.out.print("Reverse is:" + y);

    }
}
