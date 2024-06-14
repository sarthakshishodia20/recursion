public class RatMazeHalf{
    public static void printHalfPaths(int i,int j,int n,int m,String path){
        if(i==n-1 && j==m-1){
            System.out.println(path);
            return;
        }
        if(i>=n || j>=m){
            return;
        }
        // go down
        printHalfPaths(i+1, j, n, m, path+"D");
        // go right
        printHalfPaths(i, j+1, n, m, path+"R");

    }
    // to count total no. of ways 
    public static int Maze(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i>=n ||j>=m){
            return 0;
        }
       
        // rat neeche jaega
        int neeche=Maze(i+1, j, n, m);
        // rat right jaega
        int right=Maze(i, j+1, n, m);
        return neeche+right;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int ways=Maze(0,0,n,m);
        System.out.println(ways);
        printHalfPaths(0, 0, n, m,"");
    }
}