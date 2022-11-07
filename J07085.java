import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();

        for (String s : list) {
            String res = "";
            long sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    if (res.length() != 0) {
                        res += s.charAt(i);
                    }
                }
                if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                    res += s.charAt(i);
                }
            }
            for (int i = 0; i < res.length(); i++) {
                sum += res.charAt(i) - '0';
            }
            System.out.println(res + " " + sum);
        }
    }
}
