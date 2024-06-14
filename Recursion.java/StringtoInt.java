import java.util.Scanner;

public class StringtoInt {
    public static void stoi(String s, int ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Convert character to integer and add to the result
        stoi(s.substring(1), (ans * 10) + (s.charAt(0) - '0'));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String S = obj.next();
        obj.close();
        stoi(S, 0);
    }
}
// 323