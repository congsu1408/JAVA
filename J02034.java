import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] u = new int[n + 1];
        int[] key = new int[201];
        for (int i = 1; i <= n; i++) {
            u[i] = sc.nextInt();
            key[u[i]]++;
        }
        boolean k = true;
        for (int i = 1; i <= u[n]; i++) {
            if (key[i] == 0) {
                System.out.println(i);
                k = false;
            }
        }
        if (k)
            System.out.println("Excellent!");
    }
}
