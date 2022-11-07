import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            System.out.println(solve(a, k));
        }
    }

    public static long solve(long[] a, long k) {
        long count = 0;
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1L);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (map.get(k - a[i]) != null) {
                count += map.get(k - a[i]);
            }
            if (k - a[i] == a[i]) {
                count--;
            }
        }
        return count / 2;
    }
}
