import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class J07030 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) ois1.readObject();
        List<Integer> list2 = (List<Integer>) ois2.readObject();
        int[] a = new int[1000001];
        for (int n : list1) {
            int m = 1000000 - n;
            if (isPrime(n) && isPrime(m) && n < m) {
                if (list2.contains(m)) {
                    a[n] = m;
                }
            }
        }
        for (int i = 0; i < 1000001; i++) {
            if (a[i] != 0) {
                System.out.println(i + " " + a[i]);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
