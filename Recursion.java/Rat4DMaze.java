public class Rat4DMaze {
    public static void printPaths(int i,int j,int n,int m ,String path,boolean[][] isVisited){
       if(i<0 || j<0){
        return;
       }
        if(i>n || j>m){
            return;
        }
        if(isVisited[i][j]==true){
            return;
        }
        if(i==n && j==m){
            System.out.println(path);
            return;
        }
        isVisited[i][j]=true;
        printPaths(i+1, j, n, m, path+"D", isVisited);
        printPaths(i, j+1, n, m, path+"R", isVisited);
        printPaths(i, j-1, n, m, path+"L", isVisited);
        printPaths(i-1, j, n, m, path+"U", isVisited);
        isVisited[i][j]=false;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        boolean[][] isVisited=new boolean[n][m];
        printPaths(0,0,n-1,m-1,"",isVisited);
    }
    
}
