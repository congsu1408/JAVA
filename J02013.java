import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int buoc = 1;
        for (int i = 0; i < n; i++) {
            int kt = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    kt++;
                }
            }
            if (kt != 0) {
                System.out.print("Buoc " + (buoc++) + ": ");
                for (int x = 0; x < n; x++) {
                    System.out.print(a[x] + " ");
                }
                System.out.println("");
            }
        }
    }
}
