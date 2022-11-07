import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Tonggiaithua(n));
    }

    public static long Tonggiaithua(int n) {
        long t=1,s=0;
        for (int i = 1; i <= n; i++) {
            t *= i;
            s += t;
        }
        return s;
    }
}
