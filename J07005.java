import java.util.*;
import java.io.*;
import java.awt.*;

public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] res = new int[1000];
        for (int i = 0; i < 100000; i++) {
            res[in.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (res[i] > 0) {
                System.out.println(i + " " + res[i]);
            }
        }
    }
}
