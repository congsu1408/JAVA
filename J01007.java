import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            Checkfibo(n);
        }
    }
    private static void Checkfibo(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        while (fn < n) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        if (fn == n||n==0)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
