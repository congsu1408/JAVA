import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int t = sc.nextInt();
            long res = t * (t + 1) / 2;
            System.out.println(res);
        }
    }
}
