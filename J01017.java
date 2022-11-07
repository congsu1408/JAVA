import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int tmp = 1;
            String s = sc.next();
            char[] c = s.toCharArray();
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs((int)c[i] - (int)c[i - 1] )==1) {
                    tmp = 0;
                }
                else {
                    tmp = 1;
                    break;
                }
            }
            if (tmp == 0)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
