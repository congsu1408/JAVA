import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            Process(s);
        }
    }

    public static void Process(String s) {
        String a = s.trim();
        while (a.contains("  ") == true) {
            a = a.replace("  ", " ");
        }
        String[] arr = a.split(" ");
        a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        a = a.trim();
        System.out.println(a);
    }
}
