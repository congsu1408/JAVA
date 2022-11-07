import java.math.BigInteger;
import java.util.*;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String tmp = sc.next();
            BigInteger a = new BigInteger(tmp);
            tmp = sc.next();
            BigInteger b = new BigInteger(tmp);
            BigInteger GCD = a.gcd(b);
            System.out.println(GCD);
        }
    }
}
