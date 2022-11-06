import java.util.Scanner;

class Phanso {
    private long a, b;

    public Phanso(long a, long b) {
        this.a = a;
        this.b = b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long z = a % b;
            a = b;
            b = z;
        }
        return a;
    }

    public String toString() {
        long g = gcd(this.a, this.b);
        return a / g + "/" + b / g;
    }
}

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        Phanso res = new Phanso(a, b);
        System.out.println(res);
    }
}
