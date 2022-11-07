import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = sc.nextLong();
            System.out.print("Test " + i + ": ");
            Process(n);
        }
    }

    public static void Process(long n) {
        for(int i=2;i<=n;i++){
            int count=0;
            while(n%i==0){
                count++;n/=i;
            }
            if(count>0)
            System.out.print(+i+"("+count+") ");
        }
        if(n>1) System.out.print(+n+"("+1+")");
        System.out.println();
    }
}
