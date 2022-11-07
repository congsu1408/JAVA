import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private static int NUM_STUDENT = 1;
    private String id, name;
    private String className;
    private String birthday;
    private float GPA;

    public Student(String name, String className, String birthday, float GPA) {
        this.id = "B20DCCN" + String.format("%03d", NUM_STUDENT++);
        this.name = name;
        this.className = className;
        this.birthday = birthday;
        this.GPA = GPA;
    }

    public String formatBirthday(String s) {
        String[] a = s.split("/");
        String kq = "";
        if (a[0].length() == 1) {
            a[0] = "0" + a[0];
        }
        if (a[1].length() == 1) {
            a[1] = "0" + a[1];
        }
        kq = a[0] + "/" + a[1] + "/" + a[2];
        return kq;
    }

    public String toString() {
        return id + " " + name + " " + className + " " + formatBirthday(birthday) + " " + String.format("%.2f", GPA);
    }
}

public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while (t-- > 0) {
            String name = sc.nextLine();
            String className = sc.nextLine();
            String birthday = sc.nextLine();
            float GPA = sc.nextFloat();
            sc.nextLine();
            list.add(new Student(name, className, birthday, GPA));

        }
        for (Student i : list) {
            System.out.println(i);
        }
    }
}
