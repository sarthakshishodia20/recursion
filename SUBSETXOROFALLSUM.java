class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int num : nums) {
            inputList.add(num);
        }
        ArrayList<Integer> op = new ArrayList<>();
        subsets(inputList, result, op);
        int sum = 0;
        for (ArrayList<Integer> list : result) {
            sum += xorOfMe(list);
        }
        return sum;
    }
    public static void subsets(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> op) {
        if (arr.size() == 0) {
            result.add(new ArrayList<>(op)); 
            return;
        }
        ArrayList<Integer> arrCopy = new ArrayList<>(arr);
        int element = arrCopy.remove(arrCopy.size() - 1);
        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);
        op1.add(element);
        subsets(new ArrayList<>(arrCopy), result, op1);
        subsets(new ArrayList<>(arrCopy), result, op2);
    }
    public static int xorOfMe(ArrayList<Integer> a) {
        int xor = 0;
        for (int ele : a) {
            xor = xor ^ ele;
        }
        return xor;
    }
}
