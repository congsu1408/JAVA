import java.util.*;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int tmp = 0;
            int n = sc.nextInt();
            int []arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n / 2; i++) {
                if (arr[i] != arr[n - i - 1])
                    tmp = 1;
            }
            if (tmp == 0)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
