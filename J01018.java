import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (sum(s)) {
                Process(s);
            }
            else System.out.println("NO");
        }
    }

    public static boolean sum(String s) {
        int sum = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            sum += (int) c[i]-48;
        }
        if (sum%10==0)
            return true;
        return false;
    }
    public static void Process(String s) {
         int tmp = 1;
            char[] c = s.toCharArray();
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs((int)c[i] - (int)c[i - 1] )==2) {
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
