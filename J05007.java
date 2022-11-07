import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Officer implements Comparable<Officer> {
    public static int NUM_OFFICER = 1;
    private String id, name, gender, birthDate, address, taxcode, date;

    public Officer(String name, String gender, String birthDate, String address, String taxcode, String date) {
        this.id = String.format("%05d", NUM_OFFICER++);
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.taxcode = taxcode;
        this.date = date;
    }

    public Date getbirthDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(birthDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return id + " " + name + " " + gender + " " + birthDate + " " + address + " " + taxcode + " " + date;
    }

    @Override
    public int compareTo(Officer o) {
        if (this.getbirthDate().compareTo(o.getbirthDate()) > 0) {
            return 1;
        } else if (this.getbirthDate().compareTo(o.getbirthDate()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Officer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(new Officer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (Officer officer : list) {
            System.out.println(officer);
        }
    }
}
