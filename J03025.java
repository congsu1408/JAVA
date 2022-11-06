import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String s = sc.nextLine();
            int count = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    count++;
                }
            }
            if (count == 1 || s.length() % 2 == 1 && count == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        // if (count > 1)
        // System.out.println("NO");
        // else
        // System.out.println("YES");
        // }
    }
}
