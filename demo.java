import java.util.*;
import java.io.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            nextLargerElement(a, n);
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }

    public static void nextLargerElement(long[] a, int n) {
        ArrayList<HashMap<String, Integer>> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (s.size() > 0 && s.get(s.size() - 1).get("value") < a[i]) {
                HashMap<String, Integer> temp = s.get(s.size() - 1);
                s.remove(s.size() - 1);
                a[temp.get("index")] = a[i];
            }
            HashMap<String, Integer> e = new HashMap<>();
            e.put("value", (int) a[i]);
            e.put("index", i);
            s.add(e);
        }
        while (s.size() > 0) {
            HashMap<String, Integer> temp = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            a[temp.get("index")] = -1;
        }
    }
}