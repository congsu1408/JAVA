import java.util.*;

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

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        }
    }
}