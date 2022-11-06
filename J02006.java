import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         HashSet<Long> s = new HashSet<>();
         for (int i = 0; i < n + m; i++) {
             s.add(sc.nextLong());
         }
         List<Long> l = new ArrayList<Long>(s);
        for (int i = 0; i < s.size() - 1; i++) {
            System.out.print(l.get(i)+" ");
        }
        System.out.println(l.get(l.size()-1));
    }
}
