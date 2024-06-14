public class ClimbingStairsMemoization {
    public static int Ways(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=Ways(n-1, dp)+Ways(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        System.out.println(Ways(n,dp));
    }
    
}
