class Solution {
    public int triangularSum(int[] nums) {
        return recursiveTriangularSum(nums);
    }
    public static int recursiveTriangularSum(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newArr[i]=((arr[i]+arr[i+1])%10);
        }
        return recursiveTriangularSum(newArr);
    }
}
