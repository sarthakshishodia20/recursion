import java.util.ArrayList;

public class CombinationSumIII {

    public static void helper(int index,int sum,int n,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ans2,int k){
        if(sum==n && k==0){
            ans.add(new ArrayList<>(ans2));
            return;
        }
        if(sum>n){
            return;

        }
        for(int i=index;i<=9;i++){
            if(i>n){
                break;
            }
            ans2.add(i);
            helper(index+1, sum+i, n, ans, ans2, k-1);
            ans2.remove(ans2.size()-1);
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        helper(1,0,9,ans,ans2,3);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
    
}
