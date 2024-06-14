import java.util.*;

public class RemoveAllDuplicateAdjacent {
    public static void main(String[] args) {
        String s = "Sartthak";
        String ans = removeDuplicates(s);
        System.out.println(ans);
    }

    public static String removeDuplicates(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
