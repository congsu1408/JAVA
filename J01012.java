import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0 && i % 2 == 0) {
                    count++;
                }
                if (n % i == 0&&(n/i)%2==0 && n % (n / i) == 0 && i * i != n) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}