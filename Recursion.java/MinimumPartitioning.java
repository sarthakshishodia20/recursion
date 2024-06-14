public class MinimumPartitioning {
    public static void main(String[] args) {
        int[]arr={1,11,5,6};
        int ans=minimumDifference(arr);
        System.out.println(ans);
    }
        public static int minimumDifference(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int n = nums.length;
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            int W = sum / 2;
            int[][] dp = new int[n + 1][W + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= W; j++) {
                    if (nums[i - 1] <= j) {
                        dp[i][j] = Math.max(nums[i - 1] + dp[i - 1][j - nums[i - 1]], dp[i - 1][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            int sum1 = dp[n][W];
            int sum2 = sum - sum1;
            return Math.abs(sum1 - sum2);
        }
    }
    
    

