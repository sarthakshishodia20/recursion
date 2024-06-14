import java.util.Scanner;

public class generateParenthesis {
    public static void generate(String ans, int open, int close, int n) {
        if (ans.length() == 2 * n) {
            System.out.println(ans);
            return;
        }
        if (open < n) {
            generate(ans + "(", open + 1, close, n);
        }
        if (close < open) {
            generate(ans + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        obj.close();
        generate("", 0, 0, n);
    }
}
