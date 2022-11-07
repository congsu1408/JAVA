import java.util.*;

class Staff {
    public static int NUM_STAFF = 1;
    private String id, name, gender, birthDate, address, taxcode, date;

    public Staff(String name, String gender, String birthDate, String address, String taxcode, String date) {
        this.id = String.format("%05d", NUM_STAFF++);
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.taxcode = taxcode;
        this.date = date;
    }

    public String toString() {
        return id + " " + name + " " + gender + " " + birthDate + " " + address + " " + taxcode + " " + date;
    }
}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Staff> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (Staff staff : list) {
            System.out.println(staff);
        }
    }
}
