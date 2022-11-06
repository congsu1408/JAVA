import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (KtraDao(s) == 1 && KtraTong(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int KtraDao(String s) {
        String a = s;
        a = new StringBuffer(s).reverse().toString();
        if (a.equals(s)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int KtraTong(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        if (a[0] == '8' && a[a.length - 1] == '8') {
            for (int i = 0; i < s.length(); i++) {
                sum = sum + (int) (a[i] - '0');
            }
            if (sum % 10 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
