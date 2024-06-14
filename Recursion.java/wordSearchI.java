public class wordSearchI {
    public static boolean krtahai(char[][] board,int i, int j, String word,int pos){
        if(pos==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length|| j>=board[0].length){
            return false;
        }
        if(word.charAt(pos)!=board[i][j]){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        if(krtahai(board, i+1, j, word, pos+1)||krtahai(board, i-1, j, word, pos+1)||krtahai(board, i, j+1, word, pos+1)||krtahai(board, i, j-1, word, pos+1)){
            return true;
        }
        board[i][j]=temp;
        return false;
        
    }
    public static boolean exist(char[][] board,String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && krtahai(board,i,j,word,0)){
                    return true;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'S', 'C'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCECEEDA";
        System.out.println(exist(board, word));
    }
}
