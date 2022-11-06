import java.io.InputStream;
import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine();
            String[] tmp = a.split(" ");
            Set<String> s1 = new HashSet<>();
            Collections.addAll(s1, tmp);
            String b = sc.nextLine();
            String[] temp = b.split(" ");
            Set<String> s2 = new HashSet<>();
            Collections.addAll(s2, temp);
            for (String d : s1) {
                if (s2.contains(d) == false) {
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }
    }
}
