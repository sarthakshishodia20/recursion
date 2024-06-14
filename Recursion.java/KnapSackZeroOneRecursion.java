public class KnapSackZeroOneRecursion {
    public static void main(String[] args) {
        int[] val={15,14,10,45,30};
        int[] wt={2,5,1,3,4};
        int W=7;
        int[][] dp=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(KnapSackUsingRecursion(val,wt,W,val.length));
        System.out.println(knapSackUsingMemoization(val, wt,W,val.length,dp ));
        System.out.println(knapSackUsingTabulation(val, wt, W));

    }
    public static int knapSackUsingTabulation(int[] val,int wt[],int W){
        int n=val.length;
        int[][] dp=new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];
                int w=wt[i-1];
                if(w<=j){
                    int includeProfit=v+dp[i-1][j-w];
                    int excludeProfit=dp[i-1][j];
                    dp[i][j]=Math.max(includeProfit,excludeProfit);
                }
                else{
                    int excludeProfit=dp[i-1][j];
                    dp[i-1][j]=excludeProfit;
                }
            }
        }
        return dp[n][W];

    }
    public static int knapSackUsingMemoization(int[] val,int wt[],int W,int n,int[][]dp){
        if(W==0|| n==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            // include
            int ans1=val[n-1]+knapSackUsingMemoization(val, wt, W-wt[n-1], n-1, dp);
            // exclude
            int ans2=knapSackUsingMemoization(val, wt, W, n-1, dp);
            dp[n][W]=Math.max(ans1,ans2);
            return dp[n][W];
        }
        else{
            dp[n][W]=knapSackUsingMemoization(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }
    public static int KnapSackUsingRecursion(int[] val,int wt[],int W,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){
            // include
            int ans1=val[n-1]+KnapSackUsingRecursion(val,wt,W-wt[n-1],n-1);
            // exclude
            int ans2=KnapSackUsingRecursion(val,wt,W,n-1);
            return Math.max(ans1,ans2);
        }
        else{
            return KnapSackUsingRecursion(val,wt,W,n-1);
        }
    }
}
