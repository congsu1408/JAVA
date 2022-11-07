import java.util.*;
<<<<<<< HEAD

class MH {
    private String ma, ten, lop, gmail;

    public MH(String ma, String ten, String lop, String gmail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.gmail = gmail;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + gmail;
    }

}
=======
import java.io.*;
>>>>>>> b923628f4591151743a4ac5a6063a3043a03d830

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int n = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<MH> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MH a = new MH(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(a);
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String tv = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + tv + ":");
            for (MH x : list) {
                if (x.getLop().substring(1, 3).equals(tv.substring(2))) System.out.println(x);
            }
=======
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            nextLargerElement(a, n);
            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }

    public static void nextLargerElement(long[] a, int n) {
        ArrayList<HashMap<String, Integer>> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (s.size() > 0 && s.get(s.size() - 1).get("value") < a[i]) {
                HashMap<String, Integer> temp = s.get(s.size() - 1);
                s.remove(s.size() - 1);
                a[temp.get("index")] = a[i];
            }
            HashMap<String, Integer> e = new HashMap<>();
            e.put("value", (int) a[i]);
            e.put("index", i);
            s.add(e);
        }
        while (s.size() > 0) {
            HashMap<String, Integer> temp = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            a[temp.get("index")] = -1;
>>>>>>> b923628f4591151743a4ac5a6063a3043a03d830
        }
    }
}