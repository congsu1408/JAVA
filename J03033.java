import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger gcd = a.gcd(b);
            System.out.println(a.divide(gcd).multiply(b));
        }
    }
}
