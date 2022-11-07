import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            String s = sc.next();
            String a = sc.next();
            if (s.equals(a)) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(s.length(), a.length()));
            }
        }
    }
}
