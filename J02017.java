import java.util.ArrayList;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            a.add(tmp);
        }
        while (true) {
            int key = 0;
            for (int i = 0; i < a.size() - 1; i++) {
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    a.remove(i);
                    a.remove(i);
                    key++;
                }
            }
            if (key == 0)
                break;
        }
        System.out.println(a.size());
    }
}
