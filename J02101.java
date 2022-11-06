import java.util.ArrayList;
import java.util.Scanner;

public class J02101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            Print_matrix(a, n);
        }
    }

    public static void Print_matrix(int[][] a, int n) {
        boolean key = true;
        for (int i = 0; i < n; i++) {
            if (key) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
            key = !key;
        }
        System.out.println();
    }
}
