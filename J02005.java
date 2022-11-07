import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<Long> v = new Vector<>();
        Vector<Long> u = new Vector<>();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextLong());
        }
        for (int i = 0; i < m; i++) {
            u.add(sc.nextLong());
        }
        Process(v, u);
        Collections.sort(v);
        Set<Long> s = new HashSet<>();
        for (long ele : v) {
            s.add(ele);
        }
        List<Long> l = new ArrayList<Long>(s);
        for (int i = 0; i < s.size() - 1; i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.println(l.get(l.size()-1));
    }
    public static  Vector<Long> Process(Vector<Long> v,Vector<Long> u) {
        v.retainAll(u);
        return v;
    }
}
