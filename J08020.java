import java.util.*;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Character> stack = new Stack<>();
            String s = sc.next();
            int key = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        key = 1;
                        break;
                    } else {
                        char c = stack.pop();
                        if (s.charAt(i) == ')' && c != '(') {
                            System.out.println("NO");
                            key = 1;
                            break;
                        } else if (s.charAt(i) == ']' && c != '[') {
                            System.out.println("NO");
                            key = 1;
                            break;
                        } else if (s.charAt(i) == '}' && c != '{') {
                            System.out.println("NO");
                            key = 1;
                            break;
                        }
                    }
                }
            }
            if (key == 0) {
                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
