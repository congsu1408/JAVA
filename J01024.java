import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char[] c = s.toCharArray();
            int tmp = 0;
            for (char it : c) {
                if (it != '0' &&it != '1' && it != '2') {
                    tmp = 1;
                }
            }
            if (tmp == 0)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
