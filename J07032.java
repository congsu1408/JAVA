import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class J07032 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list1 = (List<Integer>) ois1.readObject();
        List<Integer> list2 = (List<Integer>) ois2.readObject();
        boolean key = true;
        int[] a = new int[1000001];
        for (int x : list1) {
            String tmp = String.valueOf(x);
            if (tmp.length() % 2 != 0 && tmp.length() > 1 && list2.contains(x)) {
                for (int i = 0; i < tmp.length(); i++) {
                    if (tmp.charAt(i) != '1' && tmp.charAt(i) != '3' && tmp.charAt(i) != '5' && tmp.charAt(i) != '7' && tmp.charAt(i) != '9') {
                        key = false;
                        break;
                    }
                }
                if (key) {
                    a[x]++;
                }
            }
        }
        for (int i = 0; i < 1000001; i++) {
            if (a[i] != 0) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
