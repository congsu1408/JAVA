import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Thisinh {
    public static int NUM_STUDENT = 1;
    private String id, s, cla, date;
    private float gpa;

    public Thisinh(String s, String cla, String date, float gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", NUM_STUDENT++);
        this.s = s;
        this.cla = cla;
        this.gpa = gpa;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.date = formatter.format(formatter.parse(date));
    }

    public String toString() {
        return id + " " + s + " " + cla + " " + date + " " + String.format("%.2f", gpa);
    }
}

public class J04006 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String cla = sc.nextLine();
            String date = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            Thisinh res = new Thisinh(s, cla, date, gpa);
            System.out.println(res);
        }
    }
}
