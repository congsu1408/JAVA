import java.util.Scanner;

public class PTBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double solution = -b / a;
        if(a!=0)
            System.out.printf("%.2f", solution);
        else if (a == 0 && b != 0)
            System.out.println("VN");
        else if(a==0&&b==0) System.out.println("VSN");
    }
}
