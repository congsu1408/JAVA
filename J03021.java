import javax.print.DocFlavor;
import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            String s = sc.next();
            String res = check(s);
            StringBuilder sb = new StringBuilder(res);
            String res1 = sb.reverse().toString();
            if (res.equals(res1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static String check(String s) {
        String tmp = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'c') {
                tmp += "2";
            } else if (s.charAt(i) == 'd' || s.charAt(i) == 'e' || s.charAt(i) == 'f') {
                tmp += "3";
            } else if (s.charAt(i) == 'g' || s.charAt(i) == 'h' || s.charAt(i) == 'i') {
                tmp += "4";
            } else if (s.charAt(i) == 'j' || s.charAt(i) == 'k' || s.charAt(i) == 'l') {
                tmp += "5";
            } else if (s.charAt(i) == 'm' || s.charAt(i) == 'n' || s.charAt(i) == 'o') {
                tmp += "6";
            } else if (s.charAt(i) == 'p' || s.charAt(i) == 'q' || s.charAt(i) == 'r' || s.charAt(i) == 's') {
                tmp += "7";
            } else if (s.charAt(i) == 't' || s.charAt(i) == 'u' || s.charAt(i) == 'v') {
                tmp += "8";
            } else if (s.charAt(i) == 'w' || s.charAt(i) == 'x' || s.charAt(i) == 'y' || s.charAt(i) == 'z') {
                tmp += "9";
            }
        }
        return tmp;
    }
}
