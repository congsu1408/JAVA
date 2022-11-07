import java.util.Scanner;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    s = s.substring(0, i) + s.substring(i + 2, s.length());
                }
            }
        }
        if (s.length() == 0) {
            System.out.println("Empty String");
        } else
            System.out.print(s);
    }
}
