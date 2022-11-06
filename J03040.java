import java.util.Scanner;

public class J03040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            String s = sc.next();
            String a = s.substring(5, 8);
            String b = s.substring(9, 11);
            s = a + b;
            if (check1(s) == 1 || check2(s) == 1 || check3(s) == 1 || check4(s) == 1) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

    public static int check1(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static int check2(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static int check3(String s) {
        for (int i = 0; i < s.length() - 3; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return 0;
            }
        }
        if (s.charAt(s.length() - 2) != s.charAt(s.length() - 1)) {
            return 0;
        }
        return 1;
    }

    public static int check4(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') {
                return 0;
            }
        }
        return 1;
    }
}
