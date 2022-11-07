<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String s = sc.nextLine();
            if (s.equals("END")) break;
            String[] a = s.trim().split("\\s+");
            StringBuilder res = new StringBuilder();
            for (String i : a) {
                res.append(Process(i)).append(" ");
            }
            System.out.println(res);
        }
        sc.close();
    }

    public static String Process(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
=======
public class J07021 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
>>>>>>> b923628f4591151743a4ac5a6063a3043a03d830
    }
}
