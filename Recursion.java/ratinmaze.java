public class ratinmaze {
    static int count=0;
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        print(array, "", 0,0);
        System.out.println(count);
    }
    public static void print(int[][] array,String ans ,int row,int col){
        if(row==2 && col==2){
            System.out.println(ans);
            count++;

            return;
        }
        if(row<0 || col<0 || row>=array.length || col>=array.length|| array[row][col]==1){
            return;
        }

        // int[] r={0,1,0,-1};
        // int[] c={1,0,-1,0};
        // array[row][col]=1;
        // for(int i=0;i<c.length;i++){
        //     print(array, ans, row+r[i], col+c[i]);
        // }
        // array[row][col]=0;
        array[row][col]=1;
        print(array, ans+"R", row+1, col);
        print(array, ans+"B", row, col+1);
        print(array, ans+"L", row-1, col);
        print(array, ans+"T", row, col-1);
        array[row][col]=0;

    }
}
