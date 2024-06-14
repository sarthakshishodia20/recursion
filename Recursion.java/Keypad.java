public class Keypad {
    final static char[][] L = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public static void letterCombinations(String givenString) {
        int len = givenString.length();
        if (len == 0) {
            System.out.println(" ");
            return;
        }
        helper(0, len, "", givenString);
    }

    public static void helper(int pos, int len, String ans, String givenString) {
        if (pos == len) {
            System.out.println(ans);
            return;
        } else {
            char[] letter = L[givenString.charAt(pos) - '0'];
            for (int i = 0; i < letter.length; i++) {
                helper(pos + 1, len, ans + letter[i], givenString);
            }
        }
    }

    public static void main(String[] args) {
        letterCombinations("568");
    }
}
