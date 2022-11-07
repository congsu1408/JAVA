import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (KtraDao(s) == 1 && KtraNTo(s) == 1) {
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

    public static int KtraNTo(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] != '2' && c[i] != '3' && c[i] != '5' && c[i] != '7') {
                return 0;
            }
        }
        return 1;
    }
}
