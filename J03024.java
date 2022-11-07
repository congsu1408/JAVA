import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Process(s);
        }
    }

    public static void Process(String s) {
        int count = 0;
        if (Check(s) == 1) {
            char[] c = s.toCharArray();
            for (int i = 1; i < s.length(); i++) {
                if (c[i] == '0' || c[i] == '2' || c[i] == '4' || c[i] == '6' || c[i] == '8') {
                    count++;
                } else
                    count--;
            }
            if (count == 0 || count < 0 && s.length() % 2 == 0 || count > 0 && s.length() % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("INVALID");
        }
    }

    public static int Check(String s) {
        char[] c = s.toCharArray();
        if (c[0] == '0')
            return 0;
        for (int i = 1; i < s.length(); i++) {
            if (c[i] < '0' || c[i] > '9') {
                return 0;
            }
        }
        return 1;
    }
}
