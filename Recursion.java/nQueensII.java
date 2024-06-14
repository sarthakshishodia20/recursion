public class nQueensII {
    public static boolean nboard(char[][] board,int row){
        if(row==board.length){
            // printBoard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
               if( nboard(board, row+1)){
                return true;
               };
                board[row][j]='.';
            }
            
        }
        return false;
    }
    public static boolean isSafe(char[][] board , int row,int col){
        // vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonally left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagnoannly right
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char[][] board){
        System.out.println("----chess board ------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }
    
    public static void main(String[] args) {
        int n=8;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nboard(board,0);
        System.out.println("Solution is possible true /false "+nboard(board,0));
    }
    
}
