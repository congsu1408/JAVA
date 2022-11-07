import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        BigInteger sum = new BigInteger("0");
        while (s.length() > 1) {
            String l = "";
            String r = "";
            for (int i = 0; i < s.length() / 2; i++) {
                l += s.charAt(i);
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                r += s.charAt(i);
            }
            BigInteger a = new BigInteger(l);
            BigInteger b = new BigInteger(r);
            sum = a.add(b);
            System.out.println(sum);
            s = sum.toString();
        }
    }
}
