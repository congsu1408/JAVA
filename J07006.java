import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        int[] b = new int[a.size()];
        for (int x : a) {
            b[x]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0) {
                System.out.println(i + " " + b[i]);
            }
        }
    }
}
