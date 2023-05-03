import java.util.Scanner;
import java.util.Stack;

public class javastack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String parentheses = scanner.next();
            System.out.println(isBalanced(parentheses));
        }
        scanner.close();
    }
    static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char ch : parentheses.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                        || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
