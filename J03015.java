import java.util.*;
import java.math.BigInteger;

public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = a.subtract(b);
        StringBuilder sb = new StringBuilder(c.toString());
        System.out.println(sb.toString());

    }
}
//000123456789012345678901234567890
//        00000000000000001234567890