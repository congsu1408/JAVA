import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>();
        while (t-- > 0) {
            String a = sc.nextLine();
            String s = a.trim();
            s = s.toLowerCase();
            while (s.contains("  ") == true) {
                s = s.replace("  ", " ");
            }
            String tmp[] = s.split(" ");
            s = "";
            s = s + tmp[tmp.length - 1];
            for (int i = 0; i < tmp.length - 1; i++) {
                s = s + tmp[i].charAt(0);
            }
            list.add(s);
            if (list.contains(s) == true) {
                if (Collections.frequency(list, s) > 1) {
                    s = s + Collections.frequency(list, s);
                }
            }
            System.out.print(s + "@ptit.edu.vn");
            System.out.println();
        }
    }
}