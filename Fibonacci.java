import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(Fibo(n));
        }
    }
    private static long Fibo(int n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }
}
