import java.util.*;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(9);
            while (true) {
                int x = queue.poll();
                if (x % n == 0) {
                    System.out.println(x);
                    break;
                }
                queue.add(x * 10);
                queue.add(x * 10 + 9);
            }
        }
    }
}
