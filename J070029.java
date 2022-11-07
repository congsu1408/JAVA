import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J070029 {
    static int[] prime = new int[1000001];

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] a = new int[1000001];
        int count = 0;
        Prime();
        for (int x : list) {
            a[x] += prime[x];
        }
        for (int i = 1000000; i >= 2; i--) {
            if (a[i] > 0) {
                count++;
                System.out.println(i + " " + a[i]);
                if (count == 10) break;
            }
        }
    }

    public static void Prime() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
}
