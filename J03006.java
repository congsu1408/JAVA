import java.util.Scanner;

public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (ktraChan(s) == 1 && ktraDao(s) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static int ktraDao(String s) {
        String a = s;
        a = new StringBuffer(s).reverse().toString();
        if (a.equals(s)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int ktraChan(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
