import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> queue = new LinkedList<>();
            List<String> list = new ArrayList<>();
            queue.add("6");
            queue.add("8");
            while (true) {
                String s = queue.poll();
                if (s.length() > n) {
                    break;
                }
                queue.add(s + "6");
                queue.add(s + "8");
                list.add(s);

            }
            System.out.println(list.size());
            Collections.reverse(list);
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
