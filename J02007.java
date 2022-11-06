import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            long n = sc.nextLong();
            int[] c = new int[100000];
            int[] key = new int[100000];
            for (int i = 0; i < n; i++) {
                c[i] = sc.nextInt();
                key[c[i]]++;
            }
            System.out.println("Test " + j + ":");
            for (int i = 0; i < 100000; i++) {
                if (key[c[i]] != 0) {
                    System.out.println(c[i] + " xuat hien " + key[c[i]] + " lan");
                    key[c[i]] = 0;
                }
            }
        }
    }
}
