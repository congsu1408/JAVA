import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] res = s.split(" ");
            String a = "";
            for (int i = 0; i < res.length; i++) {
                a += new StringBuffer(res[i]).reverse().toString();
                a += " ";
            }
            for (int i = 0; i < a.length(); i++) {
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
    }
}
