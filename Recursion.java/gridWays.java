public class gridWays {
    public static int gridWay(int i,int j,int n,int m){
        // base case
        if(i==n-1||j==m-1){
            return 1;

        }
        else if(i==n|| j==m){
            return 0;
        }
        // down ways
        int W1=gridWay(i+1, j, n, m);
        // right ways
        int W2=gridWay(i, j+1, n, m);

        return W2+W1;
    }
    
    public static void main(String[] args) {
        int m=3;
        int n=3;
        System.out.print(gridWay(0,0,n,m));

    }
}
