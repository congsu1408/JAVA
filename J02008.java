import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long res = 1;
            for (long i = 1; i <= n; i++) {
                res = BCNN(res, i);
            }
            System.out.println(res);
        }
    }

    public static long UCLN(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private static long BCNN(long a, long b) {
        return a * b / UCLN(a, b);
    }
}
