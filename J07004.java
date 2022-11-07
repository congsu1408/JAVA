import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] a = new int[100001];
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            a[n]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (a[i] != 0) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
