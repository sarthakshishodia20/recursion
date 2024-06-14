public class EditDistance {
    public static void main(String[] args) {
        String str1="execution";
        String str2="intention";
        int ans=EditDist(str1,str2);
        System.out.println(ans);
    }
    public static int EditDist(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(j==0){
                    dp[i][j]=i;

                }
                else if (i==0){
                    dp[i][j]=j;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int add=dp[i][j-1]+1;
                    int delete=dp[i-1][j];
                    int replace=dp[i-1][j-1]+1;
                    dp[i][j]=Math.min(add,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    
}
