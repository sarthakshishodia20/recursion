class Solution {
    static List<String> result;
    public List<String> restoreIpAddresses(String s) {
        result = new ArrayList<>();
        helper(s, new ArrayList<>());
        return result;
    }
    public static void helper(String str, List<String> ans) {
        if (ans.size() == 4) {
            if (str.length() == 0) {
                result.add(String.join(".", ans));
            }
            return;
        }
        for (int i = 0; i < 3 && i < str.length(); i++) {
            String left = str.substring(0, i+1);
            if (isValid(left)) {
                ans.add(left);
                helper(str.substring(i+1), ans);
                ans.remove(ans.size() - 1);
            }
        }
    }

    public static boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
    }
}
