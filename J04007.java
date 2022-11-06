import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Staff {
    private String name, sex, dob, address, tax, date;

    public Staff(String name, String sex, String dob, String address, String tax, String date) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }

    public String setDate() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = formatter.parse(date);
            return formatter.format(dob);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return "";
    }

    public String toString() {
        return "00001" + " " + name + " " + sex + " " + dob + " " + address + " " + tax + " " + date;
    }
}

public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String dob = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        Staff res = new Staff(name, sex, dob, address, tax, date);
        System.out.println(res);
    }
}
