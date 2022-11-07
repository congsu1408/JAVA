import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MonHoc implements Comparable<MonHoc> {
    private String id, name;
    private int soTC;

    public MonHoc(String id, String name, int soTC) {
        this.id = id;
        this.name = name;
        this.soTC = soTC;
    }

    public String toString() {
        return id + " " + name + " " + soTC;
    }

    @Override
    public int compareTo(MonHoc o) {
        if (this.name.compareTo(o.name) > 0) {
            return 1;
        } else if (this.name.compareTo(o.name) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for (MonHoc monHoc : list) {
            System.out.println(monHoc);
        }
    }
}
