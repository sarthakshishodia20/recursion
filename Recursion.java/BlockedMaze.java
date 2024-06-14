public class BlockedMaze {
    public static void fourPaths(int i,int j,int n,int m,String path,int[][] maze){
        if(i>=n ||j>=m){
            return;
        }
        if(i<0 || j<0){
            return ;
        }
        if(i==n-1 && j==m-1){
            System.out.println(path);
            return;
        }
        if(maze[i][j]==0){
            return;
        }
        if(maze[i][j]==-1){
            return;
        }
        maze[i][j]=-1;
        fourPaths(i+1, j, n, m, path+"D", maze);
        fourPaths(i, j+1, n, m, path+"R", maze);
        fourPaths(i-1, j, n, m, path+"U", maze);
        fourPaths(i, j-1, n, m, path+"L", maze);
        maze[i][j]=1;
    }
    public static void printPaths(int i, int j, int n, int m, String path, int[][] maze) {
        if (i < 0 || j < 0) {
            return;
        }
        if (i >= n || j >= m) {
            return;
        }
        if (i == n - 1 && j == m - 1) {
            System.out.println(path);
            return;
        }
        if (maze[i][j] == 0) {
            return;
        }

        // go down
        printPaths(i + 1, j, n, m, path + "D", maze);
        // go right
        printPaths(i, j + 1, n, m, path + "R", maze);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] maze = {{1, 0, 1, 1}, 
                         {1, 1, 1, 1}, 
                         {1, 1, 0, 1}};
        // printPaths(0, 0, n, m, "", maze);
        fourPaths(0, 0, n, m, "", maze);
    }
}
