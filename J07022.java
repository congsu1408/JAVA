import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()) {
            try {
                int a = sc.nextInt();
            } catch (Exception e) {
                arr.add(sc.next());
            }
        }
        arr.sort(String::compareTo);
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
