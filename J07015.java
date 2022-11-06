import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class J07015 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) ois.readObject();
        int[] prime = new int[10005];
        int[] res = new int[10005];
        Prime(prime);
        for (Integer i : list) {
            res[i] += prime[i];
        }
        for (int i = 0; i < 10000; i++) {
            if (res[i] > 0) {
                System.out.println(i + " " + res[i]);
            }
        }
    }

    public static void Prime(int[] prime) {
        for (int i = 2; i < 10000; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i <= 100; i++) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= 10000; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
}
