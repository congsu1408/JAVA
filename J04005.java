import java.util.Scanner;

class Thisinh {
    private String s, date;
    private double p1, p2, p3;

    public Thisinh(String s, String date, double p1, double p2, double p3) {
        this.s = s;
        this.date = date;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String toString() {
        return s + " " + date + " " + String.format("%.1f", p1 + p2 + p3);
    }
}

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String date = sc.nextLine();
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        Thisinh res = new Thisinh(s, date, p1, p2, p3);
        System.out.println(res);
    }
}
