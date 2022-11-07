import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student3 implements Comparable<Student3> {
    private static int NUM_STUDENT = 1;
    private String id, name;
    private String className;
    private String birthday;
    private float GPA;

    public Student3(String name, String className, String birthday, float GPA) {
        this.id = "B20DCCN" + String.format("%03d", NUM_STUDENT++);
        this.name = name;
        this.className = className;
        this.birthday = birthday;
        this.GPA = GPA;
    }

    public String formatName(String s) {
        String[] a = s.split(" ");
        String kq = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0) {
                kq += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
            }
        }
        return kq.trim();
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

    public int compareTo(Student3 o) {
        if (this.GPA < o.GPA) {
            return 1;
        } else if (this.GPA > o.GPA) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }

    public String toString() {
        return id + " " + formatName(name) + " " + className + " " + formatBirthday(birthday) + " " + String.format("%.2f", GPA);
    }
}

public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student3> list = new ArrayList<>();
        while (t-- > 0) {
            String name = sc.nextLine();
            String className = sc.nextLine();
            String birthday = sc.nextLine();
            float GPA = sc.nextFloat();
            sc.nextLine();
            list.add(new Student3(name, className, birthday, GPA));

        }
        Collections.sort(list);
        for (Student3 i : list) {
            System.out.println(i);
        }
    }
}
