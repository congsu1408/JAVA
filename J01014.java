import java.util.Scanner;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(UNT(n));
        }
    }

    private static long UNT(long n) {
        long res=0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n /= i;
                res = i;
            }
        }
        if (n > 1)
            {res = n;}
        return res;
    }
}
