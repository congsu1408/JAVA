import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = a.subtract(b).abs();
            StringBuilder sb = new StringBuilder(c.toString());
            int len = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < len) sb.insert(0, '0');
            System.out.println(sb.toString());
        }
    }
}