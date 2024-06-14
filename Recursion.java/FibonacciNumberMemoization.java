// import java.util.*;
public class FibonacciNumberMemoization {
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        int ans=printFibonacci(n,dp);
        System.out.println(ans);
    }
    public static int printFibonacci(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=printFibonacci(n-1, dp)+printFibonacci(n-2, dp);
        return dp[n];
    }
}
