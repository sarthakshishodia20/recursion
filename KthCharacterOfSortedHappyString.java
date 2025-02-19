class Solution {
    public String getHappyString(int n, int k) {
        List<String> happyString = new ArrayList<>();
        generateH(n, happyString, "");
        if (happyString.size() < k) {
            return "";
        }
        return happyString.get(k - 1);
    }

    private void generateH(int n, List<String> happyString, String currString) {
        if (currString.length() == n) {
            happyString.add(currString);
            return;
        }
        for (char c = 'a'; c <= 'c'; c++) {
            if (!currString.isEmpty() && currString.charAt(currString.length() - 1) == c) {
                continue;
            }
            generateH(n, happyString, currString + c);
        }
    }
}
