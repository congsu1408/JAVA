import java.util.Scanner;
import java.util.Vector;

public class J02020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ans = res(n, k);
        System.out.println();
        System.out.println("Tong cong co " + ans.size() + " to hop");
    }

    static Vector<Integer> tmp = new Vector<>();
    static Vector<Vector<Integer>> ans = new Vector<>();

    public static void LKTH(int n, int left, int k) {
        if (k == 0) {
            ans.add(tmp);
            /*
             * J02020
             * for (int i = 0; i < tmp.size(); i++) {
             * System.out.print(tmp.get(i) + " ");
             * }
             * System.out.println();
             * return;
             * System.out.println();
             * return;
             */
            for (int i = 0; i < tmp.size(); i++) {
                System.out.print(tmp.get(i));
            }
            System.out.print(" ");
        }
        for (int i = left; i <= n; i++) {
            tmp.add(i);
            LKTH(n, i + 1, k - 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static Vector<Vector<Integer>> res(int n, int k) {
        LKTH(n, 1, k);
        return ans;
    }
}
