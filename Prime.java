import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            Check(n);
        }
    }

    public static void Check(long n) {
                int tmp=0;
        if (n < 2) {
            System.out.print("NO");
        }
        else{
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0) {tmp=1;break;}
            }
            if(tmp==0) System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
