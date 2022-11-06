import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] u = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                u[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < 3; j++) {
                if (u[i][j] == 1) {
                    tmp++;
                }
            }
            if (tmp > 1)
                count++;
        }
        System.out.println(count);
    }
}
