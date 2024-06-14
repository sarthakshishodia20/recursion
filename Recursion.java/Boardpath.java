import java.util.*;

public class Boardpath {
    public static int board(int len, int dice, String ans){
        if(len == 0){
            System.out.print(ans + " ");
            return 1;
        }
        if(len < 0) return 0;
        int count = 0;
        for(int i = 1; i <= dice; i++) {
            count += board(len - i, dice, ans + i);
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int dice = sc.nextInt();
        sc.close();
        int count = board(len, dice, "");
        System.out.println();
        System.out.println("Total count of ways: " + count);
    }
}
