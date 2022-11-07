import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == '4' || c[i] == '7')
                count++;
        }
        if (count == 4 || count == 7)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
